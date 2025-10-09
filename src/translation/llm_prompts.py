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
        
        Let's think step-by-step and translate the above {source_lang} code into functionally equivalent {target_lang} code using the following instructions:
        Step 1: Analyze the structure and identify main components, control flow, data types, and dependencies
        Step 2: Map {source_lang} constructs to {target_lang} equivalents and determine required libraries
        Step 3: Generate {target_lang} code preserving exact functionality, names, logic, and program structure
        Step 4: Finally, provide only the {target_lang} code without any headers, comments, explanations, or examples
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

        Let's think step-by-step and extract a detailed algorithm from the above {source_lang} code using the following instructions:
        Step 1: Identify the code structure and analyze function signatures, classes, and program organization
        Step 2: Extract the core logic and trace execution flow, control structures, data transformations, and I/O operations
        Step 3: Document the algorithm components and specify data types, dependencies, and exact conditions
        Step 4: Finally, provide only the detailed algorithm without any headers, comments, explanations, or examples
    """).strip()

    return prompt

def get_prompt_for_algorithm_to_code_translation(algorithm, target_lang):
    prompt = textwrap.dedent(f"""
        algorithm:
        {algorithm}
        
        Let's think step-by-step and generate complete, executable {target_lang} code from the above algorithm using the following instructions:
        Step 1: Analyze the algorithm requirements and identify data structures, input/output specifications, and core logic components
        Step 2: Design the {target_lang} implementation and plan program structure, determine classes/functions, select appropriate data types, and language constructs
        Step 3: Generate the complete code and implement logic flow with proper syntax, add necessary imports/dependencies, handle edge cases, and ensure code compiles and executes correctly
        Step 4: Finally, provide only the {target_lang} code without any headers, comments, explanations, or examples
    """).strip()

    return prompt
