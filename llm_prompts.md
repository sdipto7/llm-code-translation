## Prompt for source code direct translation

```
$SOURCE_CODE

# Translate the above $SOURCE_LANG code to equivalent $TARGET_LANG code. Print only the $TARGET_LANG code and exclude any comments, headers, explanations and examples.
```


## Prompts for source code to intermediate step to code translation

#### Generate algorithm from source code

```
$SOURCE_CODE

# Generate only the step by step algorithm for the above $SOURCE_LANG code. Print only the steps and exclude any comments, headers, explanations and examples.
```

#### Generate translated code from generated algorithm

```
$GENERATED_ALGORITHM 

# Using the above algorithm, generate the $TARGET_LANG code only. Exclude any comments, headers, explanations and examples.
```