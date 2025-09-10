import os
import sys
from pathlib import Path
sys.path.append(os.path.dirname(os.path.dirname(os.path.dirname(__file__))))
import re

def get_algorithm_dir(base_dir_path):
    algorithm_dir = Path(base_dir_path).joinpath("algorithm")
    algorithm_dir.mkdir(parents=True, exist_ok=True)

    return algorithm_dir

def get_translated_code_dir(base_dir_path, target_lang):
    translated_code_dir = Path(base_dir_path).joinpath(f"{target_lang}")
    translated_code_dir.mkdir(parents=True, exist_ok=True)

    return translated_code_dir

def replace_class_name(translated_code, source_code_id):
    return re.sub(r"public\s*class\s*.+", "public class " + source_code_id + " {", translated_code)

def prepend_package_name_for_evalplus_dataset(dataset, translated_code, target_lang):
    return "package com.llmcodetranslation;\n" + translated_code if dataset == "evalplus" and target_lang == "java" else translated_code

def refine_translated_code(dataset, translated_code, source_code_id, target_lang):
    translated_code = replace_class_name(translated_code, source_code_id)
    translated_code = prepend_package_name_for_evalplus_dataset(dataset, translated_code, target_lang)

    return translated_code
