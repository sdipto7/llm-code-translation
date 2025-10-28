# Quick Start Guide

## Prerequisites

- Python 3.x installed
- API key from OpenRouter (for accessing LLM models)
- Java Development Kit (JDK) for testing Java translations [JDK8 or higher]

## Step 1: Installation

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd llm-code-translation
   ```

2. **Create a virtual environment:**
   ```bash
   python3 -m venv venv
   ```

3. **Install dependencies:**
   ```bash
   pip3 install -r requirements.txt
   ```

4. **Set up environment variables:**
   
   Create a `.env` file in the root directory:
   ```bash
   touch .env
   ```
   
   Add your OpenRouter API key to the `.env` file:
   ```
   API_KEY=your_openrouter_api_key_here
   ```

## Step 2: Prepare Dataset

Place your dataset in the `dataset` directory with the following structure:

```
dataset/
  ├── codenet/
  │   ├── Python/
  │   │   ├── Code/          # Source code files
  │   │   └── TestCases/     # Test input/output files
  │   └── Java/
  │       ├── Code/
  │       └── TestCases/
  └── avatar/
      ├── Python/
      │   ├── Code/
      │   └── TestCases/
      └── Java/
          ├── Code/
          └── TestCases/
```

**Note**: The dataset is already prepared and added within this repository.

## Step 3: Run Code Translation

Use the translation script to convert code from one language to another.

**Command syntax:**
```bash
bash scripts/translate.sh ${model} ${dataset} ${source_lang} ${target_lang} ${translation_type}
```

**Example: Translate Python to Java using GPT-4o with direct translation:**
```bash
bash scripts/translate.sh gpt-4o avatar python java direct
```

**Example: Translate Java to Python using DeepSeek with algorithm-based translation:**
```bash
bash scripts/translate.sh deepseek-v3 codenet java python algorithm
```

### Supported Options:

- **Models:** `deepseek-r1`, `deepseek-v3`, `llama-4-maverick`, `gpt-4o`, `qwen-2.5`
- **Datasets:** `avatar`, `codenet`
- **Languages:** `python`, `java`
- **Translation Types:** 
  - `direct` - Direct code translation
  - `algorithm` - Two-phase translation (source code → algorithm → target code)

### Output:

Translation results are saved in:
```
output/${model}/${dataset}/${translation_type}/${source_lang}/${target_lang}/
```

The output includes:
- Translated code files
- Excel/CSV file with translation data
- Algorithm files (when using algorithm-based translation)

## Step 4: Test Translated Code

After translation, test the generated code against test cases.

**Command syntax:**
```bash
bash scripts/test.sh ${model} ${dataset} ${source_lang} ${target_lang} ${translation_type}
```

**Example: Test the translated code:**
```bash
bash scripts/test.sh gpt-4o avatar python java direct
```

### Output:

Test results are saved in:
```
reports/${model}/${dataset}/
```

The reports include:
- Summary report with accuracy metrics
- Error reports (compile time failure, runtime failure, test failure, infinite loop execution)
- Organized code files (successful/failed translations)

## Step 5: Analyze Results

After testing, check the following locations:

1. **Summary Report:** `reports/${model}/${dataset}/${source_lang}_to_${target_lang}_for_${translation_type}.txt`
   - Total instances tested
   - Accuracy rate
   - Failure breakdowns

2. **Detailed Error Reports:** CSV files in the same reports directory
   - Compilation errors
   - Runtime errors
   - Test failures
   - Infinite loop cases

3. **Organized Code:** In the output directory, code is organized into:
   - `successful_translation/` - Code that passed all tests
   - `failed_translation/` - Code that failed

## Troubleshooting

1. **Rate Limiting (Free Models):**
   - Free models are limited to 20 requests per minute
   - The system automatically handles rate limiting with waits

2. **API Key Issues:**
   - Ensure your `.env` file is in the root directory
   - Verify your OpenRouter API key is valid

3. **Java Compilation Errors:**
   - Ensure JDK is properly installed
   - Check that `javac` and `java` commands are in your PATH

4. **Logs:**
   - Check `logs/translation.log` for detailed execution logs
