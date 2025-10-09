from pathlib import Path
import re

def get_algorithm_dir(base_dir_path):
    algorithm_dir = Path(base_dir_path).joinpath("algorithm")
    algorithm_dir.mkdir(parents=True, exist_ok=True)

    return algorithm_dir

def get_translated_code_dir(base_dir_path, target_lang):
    translated_code_dir = Path(base_dir_path).joinpath(f"{target_lang}")
    translated_code_dir.mkdir(parents=True, exist_ok=True)

    return translated_code_dir

def update_class_name_if_required(translated_code, source_code_id):
    return re.sub(r"public\s*class\s*.+", "public class " + source_code_id + " {", translated_code)
