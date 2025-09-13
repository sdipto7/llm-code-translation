import os
import subprocess
from pathlib import Path
from subprocess import Popen, PIPE
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.test.test_result import TestResult
from src.helper.model_path_helper import resolve_model_name_for_path
from src.helper.constants import SUPPORTED_LLM_API_MAP, SUPPORTED_LANGUAGE_EXTENSION_MAP
from src.helper.io_helper import read_file
from src.helper.numeric_helper import normalize_integer_output, normalize_decimal_output
from src.helper.report_helper import generate_test_report, generate_error_type_csv_report

def setup_test_environment(args, dataset, is_algorithm_based_translation):
    print(f"testing translations for {'algorithm-based approach' if is_algorithm_based_translation else 'direct approach'} with {args.model} from {args.source_lang} to {args.target_lang} using {dataset} dataset")
    
    model = SUPPORTED_LLM_API_MAP.get(args.model)
    model_name_for_path = resolve_model_name_for_path(model)

    translation_type = "algo_based_translation" if is_algorithm_based_translation else "direct_translation"
    translation_dir = f"output/{model_name_for_path}/{dataset}/{translation_type}/{args.source_lang}/{args.target_lang}"
    files = [f for f in os.listdir(translation_dir) if f.split(".")[-1] in list(SUPPORTED_LANGUAGE_EXTENSION_MAP.values())]

    test_cases_dir = f"dataset/{dataset}/{args.source_lang.capitalize()}/TestCases"
    reports_dir = f"reports/{model_name_for_path}/{dataset}"

    return {
        "translation_type": translation_type,
        "translation_dir": translation_dir,
        "files": files,
        "test_cases_dir": test_cases_dir,
        "reports_dir": reports_dir,
        "result": TestResult()
    }

def get_test_input_and_output(dataset, test_cases_dir, file, test_case_number=None):
    if dataset == "codenet":
        test_case_path = f"{test_cases_dir}/{file.split(".")[0]}"
        test_input = read_file(f"{test_case_path}_in.txt")
        expected_output = read_file(f"{test_case_path}_out.txt")

    elif dataset == "avatar" and test_case_number is not None:
        test_case_path = f"{test_cases_dir}/{file.split('.')[0]}_{test_case_number}"
        test_input = read_file(f"{test_case_path}.in")
        expected_output = read_file(f"{test_case_path}.out")

    else:
        raise ValueError(f"Unsupported dataset: {dataset}")

    return test_input, expected_output

def compile_python_code(translation_dir, file):
    subprocess.run(f"python3 -m py_compile {translation_dir}/{file}", check=True, capture_output=True, shell=True, timeout=30)

def compile_java_code(translation_dir, file):
    subprocess.run(f"javac {translation_dir}/{file}", check=True, capture_output=True, shell=True, timeout=30)

def initialize_python_process(translation_dir, file):
    return Popen(["python3", f"{translation_dir}/{file}"], stdin=PIPE, stdout=PIPE, stderr=PIPE)

def initialize_java_process(translation_dir, file):
    return Popen(["java", file.split(".")[0]], cwd=translation_dir, stdin=PIPE, stdout=PIPE, stderr=PIPE)

def run_and_validate_test_cases(process, dataset, file, test_input, expected_output, result, test_case_number=None):    
    try:
        output, error_data = process.communicate(input=test_input.encode(), timeout=100)    
    except subprocess.TimeoutExpired:
        result.add_to_infinite_loop(file)
        return "infinite_loop"

    return process_test_output(dataset, file, output, expected_output, error_data, result, test_case_number)

def process_test_output(dataset, file, output, expected_output, error_data, result, test_case_number=None):
    try:
        if float(output.decode()).is_integer():
            output, expected_output = normalize_integer_output(output, expected_output)
        else:
            output, expected_output = normalize_decimal_output(output, expected_output)
    except:
        try:
            output = output.decode()
        except:
            pass

    if(output.strip() == expected_output.strip()):
        if dataset == "codenet":
            result.add_to_test_passed(file)

        return "passed"
    else:
        try:
            error_data = error_data.decode()
        except:
            pass

        if not error_data.strip():
            if dataset == "codenet":
                result.add_to_test_failed_with_details(file, expected_output, output)

            elif dataset == "avatar" and file not in result.runtime_failed and test_case_number is not None:
                result.add_to_test_failed_with_details(file, expected_output, output, test_case_number)

        else:
            if dataset == "codenet":
                result.add_to_runtime_failed_with_details(file, error_data)
            
            elif dataset == "avatar" and file not in result.test_failed and test_case_number is not None:
                result.add_to_runtime_failed_with_details(file, error_data, test_case_number)

        return "failed"

def cleanup_java_class_files(translation_dir):
    for file in os.listdir(translation_dir):
        if ".class" in file: 
            os.remove(f"{translation_dir}/{file}")

def cleanup_results_and_get_result_map(result):
    result.cleanup_results()

    return result.get_result_map()

def prepare_test_reports(args, reports_dir, translation_type, result_map):
    os.makedirs(reports_dir, exist_ok=True)

    report_file_path = Path(reports_dir).joinpath(f"{args.source_lang}_to_{args.target_lang}_for_{translation_type}.txt")
    generate_test_report(report_file_path, result_map)

    csv_report_file_path = Path(reports_dir).joinpath(f"error_type_report_from_{args.source_lang}_to_{args.target_lang}_for_{translation_type}.csv")
    generate_error_type_csv_report(csv_report_file_path, result_map, args.source_lang, args.target_lang)
