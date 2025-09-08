import textwrap

def get_direct_translation_system_prompt():
    return textwrap.dedent("""
        You are an expert transcompiler or source-to-source code translator specializing in converting source code between programming languages.
        Your task is to provide accurate, syntactically correct translations that preserve the original logic,
        functionality, and structure while following the target language's best practices and conventions.
        Focus on maintaining semantic equivalence and ensuring the translated code is executable and efficient.
    """).strip()

def get_direct_translation_prompt(source_code_as_str, source_lang, target_lang):
    prompt = textwrap.dedent(f"""
        {source_lang} code:
        {source_code_as_str}
        
        # Translate the above {source_lang} code into functionally equivalent {target_lang} code following these requirements:
        - Preserve ALL function/method names, variable names, and algorithmic logic exactly
        - Use appropriate {target_lang} data types and syntax conventions
        - Maintain identical program structure, control flow, and execution sequence
        - Ensure the translated code is syntactically correct and executable
        - Handle all edge cases and error conditions using {target_lang} appropriate mechanisms
        - Follow {target_lang} best practices, idioms, and coding standards
        - Maintain equivalent functionality, performance characteristics, and behavior
        - Preserve the same input/output interface and data processing logic
        
        # Provide only the {target_lang} code without any headers, comments, explanations, or examples.
    """).strip()

    return prompt

def get_algorithm_based_system_prompt(source_lang, target_lang):
    return textwrap.dedent(f"""
        You are an expert code translator. You work in two phases:
        1. Extract detailed algorithms from {source_lang} code, capturing all logic and control flow
        2. Generate complete and executable {target_lang} code from the algorithms
        
        Focus on accuracy, preserving functionality, and generating working code.
    """).strip()

def get_algorithm_from_source_code_prompt(source_code_as_str, source_lang, target_lang):
    prompt = textwrap.dedent(f"""
        {source_lang} code:
        {source_code_as_str}

        Extract a detailed algorithm from this code for translation to {target_lang}:
        - function signatures with parameter and return types (consider {target_lang} equivalents)
        - variable declarations and data types (note {target_lang} compatible types)
        - complete logic flow in execution order
        - all control structures (loops, conditionals) with exact conditions
        - input/output operations and data processing logic (specify format for {target_lang})
        - required libraries, modules, or dependencies (mention {target_lang} equivalents)
        
        #Structure the algorithm to facilitate accurate {target_lang} code generation. Provide only the algorithm without any headers, comments, explanations, or examples.
    """).strip()

    return prompt

def get_translated_code_from_algorithm_prompt(algorithm, target_lang):
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