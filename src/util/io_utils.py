import os
import logging
import pandas as pd

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

def write_to_csv(path, columns, data):
    logging.info(f"Writing to csv file {path}")

    df = pd.DataFrame(data, columns=columns)
    df.to_csv(path, index=False)

    logging.info(f"CSV file {path} created successfully")
