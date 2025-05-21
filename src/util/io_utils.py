import os
import logging
from pathlib import Path
import shutil
import pandas as pd
import openpyxl
from openpyxl.styles import Alignment

os.makedirs(f'logs', exist_ok=True)
logging.basicConfig(filename=f"logs/translation.log", level=logging.INFO, format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

def read_file(file_name, encoding="utf-8"):
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

def write_translation_data_to_xlsx(path, columns, data):
    logging.info(f"Writing to translation data to the xlsx file: {path}")

    df = pd.DataFrame(data, columns=columns)
    
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

def copy_files_to_directories(files, source_dir, target_dir):
    for file in files:
        source_file = Path(source_dir).joinpath(file)
        target_file = target_dir.joinpath(file)
        if source_file.exists():
            try:
                shutil.copy2(source_file, target_file)
                logging.info(f"Copied {file} to {target_dir}")
            except Exception as e:
                logging.info(f"Error copying {file} to {target_dir}: {e}")
