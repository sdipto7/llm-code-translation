# Algorithm-Based Pipeline for Reliable and Intent-Preserving Code Translation with LLMs

[![Preprint](https://img.shields.io/badge/read-preprint-blue)](https://arxiv.org/abs/2602.16106)

### This repository contains the replication package for the research paper titled [***Algorithm-Based Pipeline for Reliable and Intent-Preserving Code Translation with LLMs***](https://dl.acm.org/doi/10.1145/3794763.3794826) accepted at 34th IEEE/ACM International Conference on Program Comprehension (**ICPC 2026**), Rio de Janeiro, Brazil.

### **Authors:** [Shahriar Rumi Dipto](https://www.linkedin.com/in/sdipto7/), [Saikat Mondal](https://saikatmondal.github.io/), and [Chanchal K. Roy](https://clones.usask.ca/)

### Please Cite as
```
@inproceedings{10.1145/3794763.3794826,
author = {Dipto, Shahriar Rumi and Mondal, Saikat and Roy, Chanchal K.},
title = {Algorithm-Based Pipeline for Reliable and Intent-Preserving Code Translation with LLMs},
year = {2026},
isbn = {9798400724824},
publisher = {Association for Computing Machinery},
address = {New York, NY, USA},
url = {https://doi.org/10.1145/3794763.3794826},
doi = {10.1145/3794763.3794826},
abstract = {Code translation, the automatic conversion of programs between languages, is a growing use case for Large Language Models (LLMs). However, direct one-shot translation often fails to preserve program intent, leading to errors in control flow, type handling, and I/O behavior. We propose an algorithm-based pipeline that introduces a language-neutral intermediate specification to capture these details before code generation. This study empirically evaluates the extent to which structured planning can improve translation accuracy and reliability relative to direct translation. We conduct an automated paired experiment – direct and algorithm-based to translate between Python and Java using five widely used LLMs on the Avatar and CodeNet datasets. For each combination (model, dataset, approach, and direction), we compile and execute the translated program and run the tests provided. We record compilation results, runtime behavior, timeouts (e.g., infinite loop), and test outcomes. We compute accuracy from these tests, counting a translation as correct only if it compiles, runs without exceptions or timeouts, and passes all tests. We then map every failed compile-time and runtime case to a unified, language-aware taxonomy and compare subtype frequencies between the direct and algorithm-based approaches. Overall, the Algorithm-based approach increases micro-average accuracy from 67.7\% to 78.5\% (↑ 10.8\%). It eliminates lexical and token errors by 100\%, reduces incomplete constructs by 72.7\%, and structural and declaration issues by 61.1\%. It also substantially lowers runtime dependency and entry-point failures by 78.4\%. These results demonstrate that algorithm-based pipelines enable more reliable, intent-preserving code translation, providing a foundation for robust multilingual programming assistants.},
booktitle = {Proceedings of the 2026 34th IEEE/ACM International Conference on Program Comprehension},
pages = {390–401},
numpages = {12},
keywords = {Automated code translation, Large Language Models, Algorithmic representation, Program synthesis},
location = {
},
series = {ICPC '26}
}
```

## LLM Models Evaluated

This study evaluates five state-of-the-art large language models:

1. **DeepSeek-V3** (`deepseek_chat`) - large Mixture-of-Experts model with state-of-the-art open-source results on code and math
2. **DeepSeek-R1** (`deepseek_r1`) - reasoning-oriented model trained with supervised fine-tuning and multi-stage RL
3. **GPT-4o** (`gpt_4o`) - OpenAI's proprietary model with strong zero-shot software-engineering performance
4. **Llama-3.3-70B-Versatile** (`llama_4_maverick`) - Meta's versatile general-purpose open-source model
5. **Qwen2.5-72B-Instruct** (`qwen_2.5_72b_instruct`) - high-capacity dense model with strong code and math skills and long-context support

All models were accessed via the OpenRouter API for consistent evaluation.

## Translation Directions

The research evaluates bidirectional translation:
- **Java → Python** (`java_to_python`)
- **Python → Java** (`python_to_java`)

## Quick Start

See [`QUICKSTART.md`](QUICKSTART.md) for detailed setup and usage instructions.

## Replication Package Structure

### 1. Dataset (Input)

The `dataset/` directory serves as the input for the translation experiments. It contains two benchmark datasets with both source code and corresponding test cases:

```
dataset/
├── avatar/
│   ├── Java/
│   │   ├── Code/          # Java source code files
│   │   └── TestCases/     # Input/output test cases for Java code
│   └── Python/
│       ├── Code/          # Python source code files
│       └── TestCases/     # Input/output test cases for Python code
└── codenet/
    ├── Java/
    │   ├── Code/          # Java source code files
    │   └── TestCases/     # Input/output test cases for Java code
    └── Python/
        ├── Code/          # Python source code files
        └── TestCases/     # Input/output test cases for Python code
```

### 2. Output (Translation Results)

The `output/` directory contains the translated code generated by different LLM models using both translation approaches:

```
output/
├── deepseek_v3/
│   ├── avatar/
│   │   ├── algo_based_translation/
│   │   │   ├── java/
│   │   │   │   ├── algorithm/       # Extracted algorithms from Java code (Phase 1)
│   │   │   │   └── python/          # Java→Python translations (algorithm-based, Phase 2)
│   │   │   └── python/
│   │   │       ├── algorithm/       # Extracted algorithms from Python code (Phase 1)
│   │   │       └── java/            # Python→Java translations (algorithm-based, Phase 2)
│   │   └── direct_translation/  
│   │       ├── java/
│   │       │   └── python/          # Java→Python translations (direct)
│   │       └── python/
│   │           └── java/            # Python→Java translations (direct)
│   └── codenet/
│       ├── algo_based_translation/
│       │   ├── java/
│       │   │   ├── algorithm/       # Extracted algorithms from Java code (Phase 1)
│       │   │   └── python/          # Java→Python translations (algorithm-based, Phase 2)
│       │   └── python/
│       │       ├── algorithm/       # Extracted algorithms from Python code (Phase 1)
│       │       └── java/            # Python→Java translations (algorithm-based, Phase 2)
│       └── direct_translation/
│           ├── java/
│           │   └── python/
│           └── python/
│               └── java/
├── deepseek_r1/
├── gpt_4o/
├── llama_4_maverick/
└── qwen_2.5_72b_instruct/
```

**Note**: All model directories follow the same hierarchical structure as shown above for `deepseek_v3`.

### 3. Reports (Evaluation Results)

The `reports/` directory contains detailed evaluation results organized by model and dataset. These reports are directly linked to specific **research questions**:

```
reports/
├── rq2_error_taxonomies.txt            # RQ2 - Error taxonomy derived from compile-time and runtime errors
├── rq3_error_taxonomy_comparison.txt   # RQ3 - Quantitative comparison of error frequencies from the error taxonomy derived from RQ2
├── deepseek_chat/
│   ├── avatar/
│   │   ├── {source}_to_{target}_for_direct_translation.txt                           # RQ1
│   │   ├── {source}_to_{target}_for_algo_based_translation.txt                       # RQ1
│   │   ├── {source}_to_{target}_compile_error_report_for_direct_translation.csv      # RQ2
│   │   ├── {source}_to_{target}_compile_error_report_for_algo_based_translation.csv  # RQ2
│   │   ├── {source}_to_{target}_runtime_error_report_for_direct_translation.csv      # RQ2
│   │   ├── {source}_to_{target}_runtime_error_report_for_algo_based_translation.csv  # RQ2
│   │   ├── {source}_to_{target}_test_fail_report_for_direct_translation.csv          # RQ2
│   │   ├── {source}_to_{target}_test_fail_report_for_algo_based_translation.csv      # RQ2
│   │   └── {source}_to_{target}_infinite_loop_report_for_algo_based_translation.csv  # RQ2
│   └── codenet/
│       └── [same structure as avatar]
├── deepseek_r1/       [same structure as deepseek_chat]
├── gpt_4o/            [same structure as deepseek_chat]
├── llama_4_maverick/  [same structure as deepseek_chat]
└── qwen_2.5_72b_instruct/  [same structure as deepseek_chat]
```

## RQ1: Effective Performance of Algorithm-based Approach

**Files:** `{source}_to_{target}_for_direct_translation.txt` and `{source}_to_{target}_for_algo_based_translation.txt`

This question evaluates the overall effectiveness and accuracy of each LLM across both translation directions.

**Examples:**
- `reports/deepseek_r1/avatar/python_to_java_for_direct_translation.txt` - Overall accuracy of DeepSeek R1 on Avatar dataset for Python→Java direct translation.
- `reports/gpt_4o/codenet/java_to_python_for_algo_based_translation.txt` - Overall accuracy of GPT-4o on CodeNet dataset for Java→Python algorithm-based translation.

## RQ2: Error Taxonomy and Frequency Distribution Observed in Each Combination

**Files:** 
- `rq2_error_taxonomies.txt` - Comprehensive error taxonomy categorizing compile time and runtime errors for both Python→Java and Java→Python translations
- `{source}_to_{target}_compile_error_report_for_*.csv` - Compilation error reports
- `{source}_to_{target}_runtime_error_report_for_*.csv` - Runtime error reports

This question analyzes all compile time and runtime errors across both translation directions to create a structured error taxonomy. The taxonomy categorizes error subtypes specific to each language direction.

**Examples:**
- `reports/rq2_error_taxonomies.txt` - Complete error taxonomy with language-specific error mappings
- `reports/deepseek_chat/avatar/python_to_java_compile_error_report_for_direct_translation.csv` - Compilation errors in DeepSeek V3's Python→Java direct translations on Avatar dataset
- `reports/qwen_2.5_72b_instruct/codenet/java_to_python_runtime_error_report_for_algo_based_translation.csv` - Runtime errors in Qwen 2.5's Java→Python algorithm-based translations on CodeNet dataset

## RQ3: Scenario and Pattern-Specific Error Reduction by Algorithm-based Approach

**Files:** 
- `rq3_error_taxonomy_comparison.txt` - Quantitative comparison of error frequencies across taxonomy categories, showing direct vs. algorithm-based approach distributions
- All error report files (compile, runtime, test fail, infinite loop) comparing direct vs. algorithm-based translation approaches

This question investigates how the algorithm-based approach reduces specific error patterns compared to direct translation. The analysis uses the error taxonomy from RQ2 to quantify error reduction rates across different categories:

**Examples:**
- `reports/rq3_error_taxonomy_comparison.txt` - Complete quantitative breakdown of error distributions across all taxonomy categories
