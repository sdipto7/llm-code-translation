import textwrap

def get_system_prompt_for_direct_translation():
    return textwrap.dedent("""
        You are an expert code translator specializing in direct source-to-source translation between programming languages.
        Your task is to convert code while preserving exact functionality, logic, and structure.

        Focus on accuracy, preserving functionality, and generating working code.
    """).strip()

def get_prompt_for_direct_translation(source_code_as_str, source_lang, target_lang):
    prompt = textwrap.dedent(f"""
        {source_lang} code:
        {source_code_as_str}
        
        # Translate the above {source_lang} code into functionally equivalent {target_lang} code:
        - Preserve function/method names, variable names, and logic exactly
        - Use correct {target_lang} syntax, data types, and conventions
        - Maintain identical program structure and control flow
        - Ensure syntactically correct and executable code
        - Handle edge cases using {target_lang} appropriate mechanisms
        - Include necessary imports, libraries, or dependencies for {target_lang}
        
        # Provide only the {target_lang} code without any headers, comments, explanations, or examples.
    """).strip()

    return prompt

def get_system_prompt_for_algorithm_based_translation():
    return textwrap.dedent("""
        You are an expert code translator. You work in two phases:
        1. Extract detailed algorithms from source code, capturing all logic and control flow
        2. Generate complete and executable code from algorithms in the target language
        
        Focus on accuracy, preserving functionality, and creating working code that passes all test cases.
    """).strip()

def get_prompt_for_source_code_to_algorithm_generation(source_code_as_str, source_lang):
    prompt = textwrap.dedent(f"""
        {source_lang} code:
        {source_code_as_str}

        Extract a detailed algorithm from this code including:
        - function signatures with parameter and return types
        - variable declarations and data types
        - complete logic flow in execution order
        - all control structures (loops, conditionals) with exact conditions
        - input/output operations and data processing logic
        - required libraries, modules, or dependencies
        
        # Provide only the algorithm without any headers, comments, explanations, or examples.
    """).strip()

    return prompt

def get_prompt_for_algorithm_to_code_translation(algorithm, target_lang):
    prompt = textwrap.dedent(f"""
        algorithm:
        {algorithm}
        
        Generate complete, executable {target_lang} code from this algorithm by:
        - creating proper {target_lang} program structure (classes, main method if needed)
        - using correct {target_lang} syntax, data types, and language constructs
        - implementing exact same logic flow as specified in the algorithm
        - handling input/output operations correctly for {target_lang}
        - including all necessary imports, libraries, and dependencies

        # Provide only the {target_lang} code without any headers, comments, explanations, or examples.
    """).strip()

    return prompt