import os
import subprocess
import pandas as pd
from pathlib import Path
from subprocess import Popen, PIPE
import argparse
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.validator.arg_validator import validate_arguments
from src.helper.result_organizer_helper import move_compile_failed_translated_codes_for_evalplus
from src.test.test_utils import (
    setup_test_environment,
    compile_java_code,    
    cleanup_java_class_files
)

def main(args, is_algorithm_based_translation, dataset="evalplus"):
    test_env = setup_test_environment(args, dataset, is_algorithm_based_translation)

    translation_dir = test_env["translation_dir"]
    files = test_env["files"]
    result = test_env["result"]

    if args.source_lang == "python" and args.target_lang == "java":
        for file in files:
            try:
                print(f"Filename: {file}")
                compile_java_code(translation_dir, file)
            except subprocess.CalledProcessError as e:
                result.add_to_compile_failed_with_details(file, e.stderr.decode('utf-8'))
            except Exception as e:
                result.add_to_compile_failed_with_details(file, e)

        cleanup_java_class_files(translation_dir)
    else:
        print(f"Dataset: {dataset} does not support {args.source_lang} as source language and {args.target_lang} as target language")
        return

    move_compile_failed_translated_codes_for_evalplus(result.get_result_map(), translation_dir)

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
