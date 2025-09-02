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
        
        Translate the above {source_lang} code into functionally equivalent {target_lang} code following these requirements:
        
        CORE REQUIREMENTS:
        1. Preserve ALL function/method names, variable names, and algorithmic logic exactly
        2. Use appropriate {target_lang} data types and syntax conventions
        3. Maintain identical program structure, control flow, and execution sequence
        4. Ensure the translated code is syntactically correct and executable
        5. Handle all edge cases and error conditions using {target_lang} appropriate mechanisms
        6. Follow {target_lang} best practices, idioms, and coding standards
        7. Maintain equivalent functionality, performance characteristics, and behavior
        8. Preserve the same input/output interface and data processing logic
        
        QUALITY STANDARDS:
        - Ensure semantic equivalence between source and target code
        - Use idiomatic {target_lang} constructs while preserving original logic
        - Maintain code readability and maintainability
        - Optimize for correctness first, then performance
        
        Provide only the {target_lang} code without any additional texts, comments, headers, or explanations.
    """).strip()

    return prompt

def get_algorithm_based_system_prompt():
    return textwrap.dedent("""
        You are an expert transcompiler or source-to-source code translator that first generates detailed algorithms 
        from source code before translating to target programming languages. Your approach involves analyzing source code 
        to extract comprehensive algorithmic representations and then converting these algorithms into clean, efficient, 
        and maintainable code across different programming paradigms. Moreover, you excel at creating structured pseudocode that 
        captures all implementation details for accurate code translation.
    """).strip()

def get_algorithm_from_source_code_prompt(source_code_as_str, source_lang):
    prompt = textwrap.dedent(f"""
        {source_lang} code:
        {source_code_as_str}
        
        Analyze the above {source_lang} code and create a detailed technical algorithm using the following structure:

        ALGORITHM SPECIFICATIONS:
        1. Function/method signatures with parameter types and return types
        2. Variable declarations with their data types and initial values
        3. Control flow structures (loops, conditionals) with exact conditions
        4. Data structures used (arrays, objects, etc.) with their properties and operations
        5. Step-by-step sequence of key operations and computations
        6. Error handling mechanisms and edge case handling
        7. Input validation and output formatting requirements
        8. Memory allocation patterns and resource management details
         
        Format requirements:
        - Use structured pseudocode with clear step numbering
        - Preserve ALL function/variable names exactly as they appear
        - Specify data types and structures with precise details
        - Document logical flow and dependencies between operations
        - Include computational complexity considerations
        - Maintain the exact algorithmic logic and mathematical operations
        
        Provide only the structured algorithm specification without any additional texts, comments, explanations, or examples.
    """).strip()

    return prompt

def get_translated_code_from_algorithm_prompt(algorithm, target_lang):
    prompt = textwrap.dedent(f"""
        Algorithm:
        {algorithm}
        
        Convert the above algorithm into syntactically correct {target_lang} code following these requirements:

        TRANSLATION REQUIREMENTS:
        1. Implement ALL function/method names and signatures exactly as specified
        2. Use appropriate {target_lang} data types that match the algorithm specifications
        3. Implement all control flow structures with the exact same logic and conditions
        4. Preserve the step-by-step sequence and dependencies between operations
        5. Handle all edge cases and error conditions as specified in the algorithm
        6. Follow {target_lang}'s best practices and conventions
        7. Ensure the code is syntactically correct, executable, and efficient
        8. Maintain the same input/output behavior as the original algorithm
        
        CODE QUALITY STANDARDS:
        - Write clean, readable, and well-structured code
        - Use appropriate {target_lang} idioms and patterns
        - Ensure proper error handling and input validation
        - Optimize for both correctness and performance

        Provide only the complete {target_lang} code implementation without any additional texts, comments, explanations, or examples.
    """).strip()

    return prompt