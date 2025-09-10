import os
import logging
from pathlib import Path
import shutil
import pandas as pd
import openpyxl
from openpyxl.styles import Alignment

os.makedirs(f'logs', exist_ok=True)
logging.basicConfig(filename=f"logs/translation.log", level=logging.INFO, format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

def read_file(file_name):
    logging.info(f"Reading file {file_name}")

    with open(file_name, "r") as f:
        content = f.read()

    logging.info(f"File {file_name} read successfully")

    return content
    
def write_to_file(file_name, content):
    logging.info(f"Writing to file {file_name}")

    with open(file_name, "w") as f:
        print(content, file=f)

    logging.info(f"File {file_name} created successfully")

def sanitize_data_for_xlsx(data):
    logging.info("Sanitizing data for xlsx")

    sanitized_data = []
    for row in data:
        sanitized_row = {}

        for key, value in row.items():
            if isinstance(value, str):
                sanitized_value = "".join(c for c in value if ord(c) >= 32 or c in ["\t", "\n", "\r"])
            else:
                sanitized_value = value

            sanitized_row[key] = sanitized_value

        sanitized_data.append(sanitized_row)

    logging.info("Data sanitized successfully")

    return sanitized_data

def write_translation_data_to_xlsx(path, columns, data):
    logging.info(f"Writing to translation data to the xlsx file: {path}")

    df = pd.DataFrame(sanitize_data_for_xlsx(data), columns=columns)
    try:
        with pd.ExcelWriter(str(path), engine="openpyxl") as writer:
            logging.info(f"Writing data to xlsx file: {path}")
            
            df.to_excel(writer, index=False, sheet_name="translation_data")

            worksheet = writer.sheets["translation_data"]
            for idx, column in enumerate(columns, 1):
                if column in ['source_code', 'translated_code', 'algorithm']:
                    worksheet.column_dimensions[chr(64 + idx)].width = 80
                else:
                    worksheet.column_dimensions[chr(64 + idx)].width = 30

            for row in worksheet.iter_rows(min_row=2):
                worksheet.row_dimensions[row[0].row].height = 300
                for cell in row:
                    cell.alignment = openpyxl.styles.Alignment(wrap_text=True, vertical='top')

        logging.info(f"xlsx file: {path} created successfully")

    except:
        logging.info(f"Error writing to xlsx file: {path}")

        csv_path = str(path).replace(".xlsx", ".csv")
        df.to_csv(csv_path, index=False)

        logging.info(f"Created csv file: {csv_path} instead due to error in xlsx creation")

def copy_files_to_directories(files, source_dir, target_dir, keep_source_files=True):
    for file in files:
        source_file = Path(source_dir).joinpath(file)
        target_file = target_dir.joinpath(file)
        if source_file.exists():
            try:
                if keep_source_files:                
                    shutil.copy2(source_file, target_file)
                    logging.info(f"Copied {file} to {target_dir}")
                else:
                    shutil.move(source_file, target_file)
                    logging.info(f"Moved {file} to {target_dir}")

            except Exception as e:
                logging.info(f"Error copying {file} to {target_dir}: {e}")

def create_successful_translation_directory(translation_dir):
    logging.info(f"Creating successful translation directory in {translation_dir}")

    success_dir = Path(translation_dir).joinpath("successful_translation")
    success_dir.mkdir(exist_ok=True)

    logging.info(f"Successful translation directory: {success_dir} created successfully")

    return success_dir


def create_failed_translation_directory(translation_dir):
    logging.info(f"Creating failed translation directory in {translation_dir}")

    fail_dir = Path(translation_dir).joinpath("failed_translation")
    fail_dir.mkdir(exist_ok=True)

    logging.info(f"Failed translation directory: {fail_dir} created successfully")

    return fail_dir


def get_successful_files(result_map):
    return set(result_map["test_passed"])


def get_failed_files(result_map, fail_categories=None):
    if fail_categories is None:
        fail_categories = ["compile_failed", "runtime_failed", "test_failed", "infinite_loop"]
    elif not isinstance(fail_categories, list):
        fail_categories = [fail_categories]

    failed_files = set()
    for category in fail_categories:
        if category in result_map:
            failed_files.update(result_map[category])

    return failed_files


def organize_translated_codes_by_result(result_map, translation_dir):
    logging.info(f"Organizing translated codes by result in {translation_dir}")

    success_dir = create_successful_translation_directory(translation_dir)
    fail_dir = create_failed_translation_directory(translation_dir)

    successful_files = get_successful_files(result_map)
    failed_files = get_failed_files(result_map)

    copy_files_to_directories(successful_files, translation_dir, success_dir)
    copy_files_to_directories(failed_files, translation_dir, fail_dir)

    logging.info(f"Organized test results into {success_dir} and {fail_dir}")


def move_compile_failed_translated_codes_for_evalplus(result_map, translation_dir):
    logging.info(f"Organizing translated codes by result in {translation_dir}")

    fail_dir = create_failed_translation_directory(translation_dir)
    failed_files = get_failed_files(result_map, "compile_failed")
    copy_files_to_directories(failed_files, translation_dir, fail_dir, keep_source_files=False)

    logging.info(f"Moved compile failed files to {fail_dir}")
