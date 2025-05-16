## Prompt for source code direct translation

```
$SOURCE_CODE

# Translate the above $SOURCE_LANG code into the corresponding $TARGET_LANG code. Provide only the $TARGET_LANG code without including any comments, headers, explanations, and examples. Ensure that the translation is precise and retains the original code logic.
```


## Prompts for source code to intermediate step to code translation

#### Generate an algorithm from source code

```
$SOURCE_CODE

# Translate the above $SOURCE_LANG code into a step-by-step algorithm. Provide only the algorithm steps without including any comments, headers, explanations, and examples. Ensure the algorithm reflects the logic and flow of the original code accurately.
```

#### Generate translated code from the generated algorithm

```
$GENERATED_ALGORITHM 

# Using the above generated algorithm, generate the corresponding $TARGET_LANG code. Provide only the $TARGET_LANG code, ensuring it follows the algorithm accurately, and exclude any comments, headers, explanations, and examples.
```