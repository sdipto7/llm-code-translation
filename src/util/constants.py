def get_extension_map():
    return {
        "java": "java",
        "python": "py"
    }

def get_model_map():   
    return {
        "gpt-4o": "openai/gpt-4o",
        "gemini-flash-2.5": "google/gemini-2.5-flash-preview-05-20",
        "llama-4-maverick": "meta-llama/llama-4-maverick:free",
        "qwen-2.5-coder": "qwen/qwen-2.5-coder-32b-instruct:free",
        "qwen-2.5": "qwen/qwen-2.5-72b-instruct:free",
        "deepseek-r1": "deepseek/deepseek-r1:free",
        "deepseek-v3": "deepseek/deepseek-chat:free"
    }
