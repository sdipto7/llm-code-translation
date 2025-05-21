from pathlib import Path
import logging
import os
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.util.io_utils import copy_files_to_directories

os.makedirs(f'logs', exist_ok=True)
logging.basicConfig(filename=f"logs/translation.log", level=logging.INFO, format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

def create_success_fail_directories(translation_dir):
    logging.info(f"Creating success and fail directories in {translation_dir}")

    success_dir = Path(translation_dir).joinpath("successful_translation")
    success_dir.mkdir(exist_ok=True)

    fail_dir = Path(translation_dir).joinpath("failed_translation")
    fail_dir.mkdir(exist_ok=True)

    logging.info(f"Success directory: {success_dir}, Fail directory: {fail_dir} created successfully")

    return success_dir, fail_dir

def get_successful_files(result_map):
    return set(result_map["test_passed"])

def get_failed_files(result_map):
    failed_files = set()
    for category in ["compile_failed", "runtime_failed", "test_failed", "infinite_loop"]:
        failed_files.update(result_map[category])

    return failed_files

def organize_translated_codes_by_result(result_map, translation_dir):
    logging.info(f"Organizing translated codes by result in {translation_dir}")

    success_dir, fail_dir = create_success_fail_directories(translation_dir)
    
    successful_files = get_successful_files(result_map)
    failed_files = get_failed_files(result_map)

    copy_files_to_directories(successful_files, translation_dir, success_dir)
    copy_files_to_directories(failed_files, translation_dir, fail_dir)

    logging.info(f"Organized test results into {success_dir} and {fail_dir}")