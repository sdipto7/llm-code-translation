import os
import subprocess
import argparse
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.validator.arg_validator import validate_arguments
from src.helper.result_organizer_helper import organize_translated_codes_by_result
from src.test.test_utils import (
    setup_test_environment,
    compile_python_code,
    compile_java_code,
    initialize_python_process,
    initialize_java_process,
    run_and_validate_test_cases,
    get_test_input_and_output,
    cleanup_java_class_files,
    prepare_test_reports,
    cleanup_results_and_get_result_map
)

def main(args, is_algorithm_based_translation, dataset="codenet"):
    test_env = setup_test_environment(args, dataset, is_algorithm_based_translation)

    translation_type = test_env["translation_type"]
    translation_dir = test_env["translation_dir"]
    files = test_env["files"]
    test_cases_dir = test_env["test_cases_dir"]
    reports_dir = test_env["reports_dir"]
    result = test_env["result"]

    if args.target_lang in ["python", "java"]:
        for file in files:
            try:
                print(f"Filename: {file}")

                if args.target_lang == "python":
                    compile_python_code(translation_dir, file)
                    process = initialize_python_process(translation_dir, file)
                else:
                    compile_java_code(translation_dir, file)
                    process = initialize_java_process(translation_dir, file)

                test_input, expected_output = get_test_input_and_output(dataset, test_cases_dir, file)

                run_and_validate_test_cases(process, dataset, file, test_input, expected_output, result)

            except subprocess.CalledProcessError as e:
                result.add_to_compile_failed_with_details(file, e.stderr.decode('utf-8'))
            except Exception as e:
                result.add_to_compile_failed_with_details(file, e)
        
        if args.target_lang == "java":
            cleanup_java_class_files(translation_dir)

    else:
        print(f"language:{args.target_lang} is not yet supported")
        return

    result_map = cleanup_results_and_get_result_map(result)

    organize_translated_codes_by_result(result_map, translation_dir)

    prepare_test_reports(args, reports_dir, translation_type, result_map)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", help="model used for code translation", required=True, type=str)
    parser.add_argument("--source_lang", help="source language of the translated code", required=True, type=str)
    parser.add_argument("--target_lang", help="target language of the translated code", required=True, type=str)
    parser.add_argument("--translation_type", help="type of translation to use", required=True, type=str)

    args = parser.parse_args()
    validate_arguments(args, is_test=True)

    is_algorithm_based_translation = args.translation_type == "algorithm"

    main(args, is_algorithm_based_translation)
