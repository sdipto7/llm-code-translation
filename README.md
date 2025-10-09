## Models
```
[deepseek-r1, deepseek-v3, llama-4-maverick, gpt-4o, qwen-2.5]
```

## Datasets
```
[avatar, codenet]
```

## Source Languages
```
[python, java]
```

## Target Languages
```
[java, python]
```

## Translation Types
```
[direct, algorithm]
```

## Command Syntax
### Translation Command
Translate from source language to target language using a specific translation type, dataset, and model.
```
bash scripts/translate.sh ${model} ${dataset} ${source_lang} ${target_lang} ${translation_type}
```

### Testing Command
Test the translated code for a specific translation type, dataset, and model.
```
bash scripts/test.sh ${model} ${dataset} ${source_lang} ${target_lang} ${translation_type}
```

## Note: 
Substitute ${model} with a supported model (e.g., gpt-4o), ${dataset} with a dataset name (e.g., avatar), ${source_lang} with a source language (e.g., python), ${target_lang} with a target language (e.g., java), and ${translation_type} with the desired translation type (e.g., direct).