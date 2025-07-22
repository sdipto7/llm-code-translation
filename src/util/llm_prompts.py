import textwrap

def get_system_prompt(source_lang, target_lang):
    prompt = textwrap.dedent("""
        You are **CodeTranspiler**, an expert compiler engineer.
        Global rules (apply to every request):
        # Follow the user's stage-specific instructions *exactly*.
        # Output must contain only the required blocks, in the required order.
            - Stage 1:  ### BEGIN ALGO ... ### END ALGO then ### BEGIN RATIONALE ... ### END RATIONALE  
            - Stage 2:  ### BEGIN CODE ... ### END CODE  then  ### BEGIN RATIONALE ... ### END RATIONALE
        # No markdown code fences, headings, comments, or blank lines outside those blocks.
        # Keep original identifiers unless the user says to rename them.
        # Ensure target-language code is complete and compiles (include imports / using / package lines).
        # RATIONALE ≤ 150 words; explain the key mapping or inference steps—no hidden thoughts.
        # If text appears outside the BEGIN/END markers, delete it.

        Stay deterministic and concise; never add creative embellishments.
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
        You are an expert compiler engineer.

        Task 1: Distill the following {source_lang} program into an ordered list of algorithmic steps that preserves the exact control flow and data transformations.

        Formatting rules for the ALGORITHM block
        • One step per line, numbered "1.", "2.", ...
        • Use imperative verbs (load, compute, return...).
        • Keep original identifiers verbatim.
        • Do NOT add headings, markdown fences, or blank lines.

        Task 2: Write a concise RATIONALE (max 150 words) that explains how you derived the algorithm and highlights any non-obvious choices (e.g., loop unrolling, early exits).

        ### BEGIN SOURCE CODE
        {source_code_as_str}
        ### END SOURCE CODE

        Respond with **exactly** the following blocks in order:

        ### BEGIN ALGO
        <ordered steps here>
        ### END ALGO
        ### BEGIN RATIONALE
        <succinct explanation here>
        ### END RATIONALE
    """).strip()

    return prompt

def get_translated_code_from_algorithm_prompt(algorithm, target_lang):
    prompt = textwrap.dedent(f"""
        You are the same compiler engineer who generated an algorithm from a source code that preserves the exact control flow and data transformations.

        Task 1: Convert the ALGORITHM below into valid, idiomatic {target_lang} code that compiles and runs.

        Code requirements
        • Implement every step faithfully.
        • Reuse identifiers unless illegal in {target_lang}.
        • Include all necessary imports / package or using statements.
        • Preserve error-handling semantics.
        • No comments, markdown fences, or extra blank lines.

        Task 2: Write a concise RATIONALE (max 150 words) describing key mapping decisions (e.g., how data structures, control flow, or exceptions were represented in {target_lang}).

        ### BEGIN ALGORITHM
        {algorithm}
        ### END ALGORITHM

        Respond with **exactly** the following blocks in order:

        ### BEGIN CODE
        <complete {target_lang} code here>
        ### END CODE
        ### BEGIN RATIONALE
        <succinct explanation here>
        ### END RATIONALE
    """).strip()

    return prompt