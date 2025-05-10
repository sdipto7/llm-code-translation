import json
import os
import argparse
from pathlib import Path
from dotenv import load_dotenv
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.validator.arg_validator import validate_arguments

def main(args):
    model = os.getenv("MODEL")

    ordered_files = [x.strip() for x in open("evalplus_target_files.txt", "r").readlines()]
    os.makedirs(args.report_dir, exist_ok=True)
    compile_failed = []
    runtime_failed = []
    test_failed = []

    for f in ordered_files:

        fname = f + '.java'

        if os.path.exists(f'dataset/evalplus/evalplus_java/target/surefire-reports/com.example.{f}Test.txt'):
            with open(f'dataset/evalplus/evalplus_java/target/surefire-reports/com.example.{f}Test.txt', 'r') as report:
                content = report.read()
                if 'Errors: 0' not in content:
                    runtime_failed.append([fname, content])
                else:
                    test_failed.append([fname, content])

        elif f in []: 
            runtime_failed.append([fname, 'the program enters an infinite loop'])

        else:
            os.system(f'javac dataset/evalplus/evalplus_java/src/main/java/com/example/{fname} 2> compile_out.txt')
            with open('compile_out.txt', 'r') as report:
                compile_failed.append([fname, report.read()])
            
            os.remove('compile_out.txt')

    model_path_for_report = model.replace('/', '_').replace('-', '_')

    json_fp = Path(args.report_dir).joinpath(f"{model_path_for_report}_evalplus_errors_from_{args.source_lang}_to_{args.target_lang}_{args.attempt}.json")
    with open(json_fp, "w", encoding="utf-8") as report:
        error_files = {'compile': compile_failed, 'runtime': runtime_failed, 'incorrect': test_failed}
        json.dump(error_files, report)
        report.close()


if __name__ == "__main__":

    load_dotenv(override=True)

    parser = argparse.ArgumentParser()
    parser.add_argument('--model', help='model used for code translation. should be one of [gpt-4o, deepseek-r1, gemini-flash-1.5, llama-4-maverick]', required=True, type=str)
    parser.add_argument('--source_lang', help='source language of the translated code. should be one of [Python,Java]', required=True, type=str)
    parser.add_argument('--target_lang', help='target language of the translated code. should be one of [Python,Java]', required=True, type=str)
    parser.add_argument('--translation_type', help='type of translation to use. should be one of [algorithm,direct]', required=True, type=str)
    parser.add_argument('--result_dir', help='path to directory to store result', required=True, type=str)

    args = parser.parse_args()
    validate_arguments(args, is_test=True)

    main(args)
