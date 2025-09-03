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
        
        # Provide only the {target_lang} code without any additional texts, comments, headers, or explanations.
    """).strip()

    return prompt

def get_algorithm_based_system_prompt():
    return textwrap.dedent("""
        You are an expert transcompiler or source-to-source code translator specializing in algorithm-based code translation between programming languages.
        Your methodology (algorithm-based code translation) involves two distinct phases: first extracting detailed algorithmic specifications from source code,
        then generating clean, efficient target code from these specifications. You excel at creating language-agnostic
        algorithmic representations that capture all implementation details, control flows, and dependencies necessary
        for accurate cross-language translation while maintaining semantic equivalence across different programming paradigms.
    """).strip()

def get_algorithm_from_source_code_prompt(source_code_as_str, source_lang):
    prompt = textwrap.dedent(f"""
        {source_lang} code:
        {source_code_as_str}

        # Analyze the {source_lang} code and create a detailed step-by-step algorithm with:
        - Function/method signatures with parameter types and return types
        - Variable declarations and data types used
        - Step-by-step logic flow with numbered sequential steps
        - Control flow structures (loops, conditionals) with exact conditions and exit criteria
        - Input/output operations and data processing logic
        - Error handling mechanisms and edge case handling
        - External dependencies, imports, and library function calls
        
        # Provide only the structured algorithm specification without any additional texts, comments, explanations, or examples.
    """).strip()

    return prompt

def get_translated_code_from_algorithm_prompt(algorithm, target_lang):
    prompt = textwrap.dedent(f"""
        algorithm:
        {algorithm}
        
        # Translate the algorithm into syntactically correct {target_lang} code following these requirements:
        - Create complete, executable code with {target_lang}'s proper structure
        - Use correct {target_lang} syntax and data types
        - Implement exact same logic and control flow as specified in the algorithm
        - Handle input/output operations appropriately for {target_lang}
        - Apply all function/variable names as per {target_lang}'s naming conventions
        - Convert external dependencies to appropriate {target_lang} libraries or modules
        - Follow {target_lang}'s best practices and coding conventions
        - Ensure the code is syntactically correct, executable, and efficient
        - Include necessary imports, includes, or module declarations for {target_lang}
        - Maintain semantic equivalence with the original algorithm

        # Provide only the complete {target_lang} code implementation without any additional texts, comments, explanations, or examples.
    """).strip()

    return prompt