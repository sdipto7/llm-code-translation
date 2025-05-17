import logging
import os
import sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
from src.util.io_utils import read_file

os.makedirs(f'logs', exist_ok=True)
logging.basicConfig(filename=f"logs/translation.log", level=logging.INFO, format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

def check_and_load_cache(filename):
    logging.info(f"Checking cache file: {filename}")
    
    if filename.exists():
        try:
            content = read_file(filename)
            if content.strip():
                return True, content
            
            return False, None

        except Exception as e:
            logging.info(f"Failed to read cache file {filename}: {e}")

    return False, None
