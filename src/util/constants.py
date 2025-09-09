def get_extension_map():
    return {
        "java": "java",
        "python": "py"
    }

def get_model_map():   
    return {
        "gpt-4o": "openai/gpt-4o",
        "claude-sonnet-4": "anthropic/claude-sonnet-4",
        "gemini-flash-2.5": "google/gemini-2.5-flash",
        "llama-4-maverick": "meta-llama/llama-4-maverick:free",
        "qwen-3-coder": "qwen/qwen3-coder:free",
        "qwen-2.5-coder": "qwen/qwen-2.5-coder-32b-instruct:free",
        "qwen-2.5": "qwen/qwen-2.5-72b-instruct:free",
        "deepseek-r1": "deepseek/deepseek-r1:free",
        "deepseek-v3.1": "deepseek/deepseek-chat-v3.1:free"
    }
