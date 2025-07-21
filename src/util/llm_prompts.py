import textwrap

def get_system_prompt():
    return "You are a helpful assistant."

def get_direct_translation_prompt(source_code_as_str, source_lang, target_lang):
    prompt = textwrap.dedent(f"""
        {source_code_as_str}
        # Translate the above {source_lang} code into the corresponding {target_lang} code.
        # Provide only the {target_lang} code without including any comments, headers, explanations, and examples.
        # Ensure that the translation is precise and retains the original code logic.
    """).strip()

    return prompt

def get_algorithm_from_source_code_prompt(source_code_as_str, source_lang):
    prompt = textwrap.dedent(f"""
        {source_code_as_str}
        # Translate the above {source_lang} code into a step-by-step algorithm.
        # Provide only the algorithm steps without including any comments, headers, explanations, and examples.
        # Ensure the algorithm reflects the logic and flow of the original code accurately.
    """).strip()

    return prompt

def get_translated_code_from_algorithm_prompt(algorithm, target_lang):
    prompt = textwrap.dedent(f"""
        {algorithm}
        # Using the above generated algorithm, generate the corresponding {target_lang} code.
        # Provide only the {target_lang} code, ensuring it follows the algorithm accurately, and exclude any comments, headers, explanations, and examples.
    """).strip()

    return prompt