import os
import subprocess
import pandas as pd
from pathlib import Path
from dotenv import load_dotenv
from subprocess import Popen, PIPE
import argparse
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.validator.arg_validator import validate_arguments
from src.util.constants import get_model_env_map, get_extension_map
from src.helper.model_path_helper import resolve_model_name_for_path
from src.helper.numeric_helper import normalize_integer_output, normalize_decimal_output
from src.util.io_utils import read_file
from src.helper.report_helper import generate_test_report, generate_error_type_csv_report

def main(args, is_algorithm_based_translation):
    dataset = "avatar"
    print(f"testing translations for {'algorithm-based approach' if is_algorithm_based_translation else 'direct approach'} with {args.model} from {args.source_lang} to {args.target_lang} using {dataset} dataset")

    model = os.getenv(get_model_env_map().get(args.model))
    model_name_for_path = resolve_model_name_for_path(model)

    translation_type_for_path = "algo_based_translation" if is_algorithm_based_translation else "direct_translation"
    translation_dir = f"output/{translation_type_for_path}/{model_name_for_path}/{dataset}/{args.source_lang}/{args.target_lang}"
    files = [f for f in os.listdir(translation_dir) if f.split(".")[-1] in list(get_extension_map().values())]

    test_cases_dir = f"dataset/{dataset}/{args.source_lang.capitalize()}/TestCases"
    
    test_passed =[]
    compile_failed = []
    runtime_failed = []
    test_failed =[]
    infinite_loop = []
    test_failed_details = []
    runtime_failed_details= []

    if args.target_lang == "python":
        for file in files:

            try:
                print(f"Filename: {file}")
                subprocess.run(f"python3 -m py_compile {translation_dir}/{file}", check=True, capture_output=True, shell=True, timeout=30)

                tests_passed = 0
                for j in range(1000):
                    if not os.path.exists(f"{test_cases_dir}/{file.split('.')[0]}_{j}.in"):
                        if tests_passed == j:
                            test_passed.append(file)
                        break

                    test_case_path = f"{test_cases_dir}/{file.split('.')[0]}_{j}"
                    test_input = read_file(f"{test_case_path}.in")
                    expected_output = read_file(f"{test_case_path}.out")

                    p = Popen(["python3", f"{translation_dir}/{file}"], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
                    try:
                        output, error_data = p.communicate(input=test_input.encode(), timeout=100)
                    except subprocess.TimeoutExpired:
                        infinite_loop.append(file)
                        break

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
                        tests_passed += 1
                    else:
                        try:
                            error_data = error_data.decode()
                        except:
                            pass

                        if not error_data.strip():
                            if file not in runtime_failed:
                                test_failed.append(file)
                                test_failed_details.append(f"Test Index: {str(j)} Filename: {file} Actual: {str(expected_output)} Generated: {str(output)}")
                        else:
                            if file not in test_failed:
                                runtime_failed.append(file)
                                runtime_failed_details.append(f"Test Index: {str(j)} Filename: {file} Error_type: {str(error_data)}")

            except Exception as e:
                compile_failed.append(file)

    elif args.target_lang == "java":
        for file in files:

            try:
                print(f"Filename: {file}")
                subprocess.run(f"javac {translation_dir}/{file}", check=True, capture_output=True, shell=True, timeout=30)

                tests_passed = 0
                for j in range(1000):
                    if not os.path.exists(f"{test_cases_dir}/{file.split('.')[0]}_{j}.in"):
                        if tests_passed == j:
                            test_passed.append(file)
                        break

                    test_case_path = f"{test_cases_dir}/{file.split('.')[0]}_{j}"
                    test_input = read_file(f"{test_case_path}.in")
                    expected_output = read_file(f"{test_case_path}.out")

                    p = Popen(["java", file.split(".")[0]], cwd=translation_dir, stdin=PIPE, stdout=PIPE, stderr=PIPE)
                    try:
                        output, error_data = p.communicate(input=test_input.encode(), timeout=100)
                    except subprocess.TimeoutExpired:
                        infinite_loop.append(file)
                        break

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
                        tests_passed += 1
                    else:
                        try:
                            error_data = error_data.decode()
                        except:
                            pass

                        if not error_data.strip():
                            if file not in runtime_failed:
                                test_failed.append(file)
                                test_failed_details.append(f"Test Index: {str(j)} Filename: {file} Actual: {str(expected_output)} Generated: {str(output)}")
                        else:
                            if file not in test_failed:
                                runtime_failed.append(file)
                                runtime_failed_details.append(f"Test Index: {str(j)} Filename: {file} Error_type: {str(error_data)}")

            except Exception as e:
                compile_failed.append(file)
                
        for file in os.listdir(translation_dir):
            if ".class" in file: 
                os.remove(translation_dir + "/" + file)

    else:
        print(f"language:{args.target_lang} is not yet supported")
        return

    test_passed = list(set(test_passed))
    compile_failed = list(set(compile_failed))
    runtime_failed = list(set(runtime_failed))
    test_failed = list(set(test_failed))
    infinite_loop = list(set(infinite_loop))
    test_failed_details = list(set(test_failed_details))
    runtime_failed_details = list(set(runtime_failed_details))

    for instance in infinite_loop[:]:
        if instance in test_failed:
            infinite_loop.remove(instance)

    result_map = {
        "test_passed": test_passed,
        "compile_failed": compile_failed,
        "runtime_failed": runtime_failed,
        "test_failed": test_failed,
        "infinite_loop": infinite_loop,
        "test_failed_details": test_failed_details,
        "runtime_failed_details": runtime_failed_details
    }
    
    os.makedirs(args.report_dir, exist_ok=True)
    report_file_path = Path(args.report_dir).joinpath(f"{translation_type_for_path}_{model_name_for_path}_{dataset}_from_{args.source_lang}_to_{args.target_lang}.txt")
    generate_test_report(report_file_path, result_map)

    csv_report_file_path = Path(args.report_dir).joinpath(f"{translation_type_for_path}_{model_name_for_path}_{dataset}_error_type_report_from_{args.source_lang}_to_{args.target_lang}.csv")
    generate_error_type_csv_report(csv_report_file_path, result_map, args.source_lang, args.target_lang)


if __name__ == "__main__":

    load_dotenv(override=True)

    parser = argparse.ArgumentParser()
    parser.add_argument("--model", help="model used for code translation", required=True, type=str)
    parser.add_argument("--source_lang", help="source language of the translated code", required=True, type=str)
    parser.add_argument("--target_lang", help="target language of the translated code", required=True, type=str)
    parser.add_argument("--translation_type", help="type of translation to use", required=True, type=str)
    parser.add_argument("--report_dir", help="path to directory to store report", required=True, type=str)

    args = parser.parse_args()
    validate_arguments(args, is_test=True)

    is_algorithm_based_translation = args.translation_type == "algorithm"

    main(args, is_algorithm_based_translation)
