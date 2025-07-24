import textwrap

def get_system_prompt(source_lang, target_lang):
    prompt = textwrap.dedent("""
        You are an expert compiler engineer who can translate {source_lang} code to {target_lang} code.

        Global rules (apply to every request):
        # Output only the required BEGIN/END blocks in the user-specified order.
        # No markdown code fences, headings, comments, or blank lines outside those blocks.
        # Stay deterministic and concise; never add creative embellishments.
    """).strip()

    return prompt

def get_direct_translation_prompt(source_code_as_str, source_lang, target_lang):
    prompt = textwrap.dedent(f"""
        You are an expert compiler engineer.

        Task 1: Translate the {source_lang} program below into idiomatic, runnable {target_lang} code while preserving the exact logic and data flow.

        Code requirements
        • Implement every construct faithfully.
        • Reuse original identifiers unless illegal in {target_lang}.
        • Include any required imports / using / package lines.
        • Do NOT add comments, markdown fences, headings, or blank lines outside the code block.

        Task 2: Write a concise RATIONALE (≤ 150 words) explaining key translation choices (e.g., data types, control-flow mapping, library substitutions).

        ### BEGIN SOURCE CODE
        {source_code_as_str}
        ### END SOURCE CODE

        Respond with **exactly** the following blocks in order:

        ### BEGIN CODE
        <complete {target_lang} code here>
        ### END CODE
        ### BEGIN RATIONALE
        <succinct explanation here>
        ### END RATIONALE
    """).strip()

    return prompt

def get_algorithm_from_source_code_prompt(source_code_as_str, source_lang):
    prompt = textwrap.dedent(f"""
        The source code is given below within the "### BEGIN SOURCE CODE" and "### END SOURCE CODE" block. Now, let's think step-by-step and solve the following tasks-

        Task 1: Translate the below {source_lang} program into an ordered list of algorithmic steps that preserves the exact control flow and data transformations.
        ALGORITHM requirements:
        - One step per line, numbered "1.", "2.", ...
        - Include the exact condition for eveyr if/while/for in parantheses.
        - Use imperative verbs (load, compute, return...).
        - Keep original identifiers verbatim.
        - Do NOT add headings, markdown fences, or blank lines.

        Task 2: Write a concise RATIONALE (max 100 words) that explains how you derived the algorithm and highlights any non-obvious choices (e.g., loop unrolling, early exits).

        Task 3: Provide five I/O examples the source program can handle including edge cases, special cases, and error cases. Run the source code mentally to ensure the outputs are correct.

        ### BEGIN SOURCE CODE
        {source_code_as_str}
        ### END SOURCE CODE

        Respond with exactly the following blocks in order:
        ### BEGIN ALGORITHM
        <ordered steps here>
        ### END ALGORITHM
        ### BEGIN RATIONALE
        <succinct explanation here>
        ### END RATIONALE
        ### BEGIN EXAMPLES
        <five I/O examples in the format: "Input: <input>; Output: <output>">
        ### END EXAMPLES
    """).strip()

    return prompt

def get_translated_code_from_algorithm_prompt(algorithm, rationale, examples, target_lang):
    prompt = textwrap.dedent(f"""
        The algorithm is given below within the "### BEGIN ALGORITHM" and "### END ALGORITHM" block. The rationale of how the algorithm was derived is also given below within the "### BEGIN RATIONALE" and "### END RATIONALE" block.
        Again, the I/O examples are given below within the "### BEGIN EXAMPLES" and "### END EXAMPLES" block. Now, Let's think step-by-step and solve the following tasks-

        Task 1: Convert the ALGORITHM below into valid, idiomatic {target_lang} code that compiles and runs.
        Code requirements:
        - Implement every step faithfully.
        - Try to analyze and use the rationale of the algorithm to make better choices.
        - Include all necessary imports / package or using statements.
        - Preserve error-handling semantics.
        - Mentally run the translated code against the provided examples to ensure correctness. Make sure the code produces the same outputs.
        - No comments, markdown fences, or extra blank lines.

        Task 2: Write a concise RATIONALE (max 100 words) describing key mapping decisions (e.g., how data structures, control flow, or exceptions were represented in {target_lang}).

        ### BEGIN ALGORITHM
        {algorithm}
        ### END ALGORITHM
        ### BEGIN RATIONALE
        {rationale}
        ### END RATIONALE
        ### BEGIN EXAMPLES
        {examples}
        ### END EXAMPLES        

        Respond with exactly the following blocks in order:
        ### BEGIN CODE
        <complete {target_lang} code here>
        ### END CODE
        ### BEGIN RATIONALE
        <succinct explanation here>
        ### END RATIONALE
    """).strip()

    return prompt