OPENROUTER_BASE_URL = "https://openrouter.ai/api/v1"

SUPPORTED_LANGUAGE_EXTENSION_MAP = {"java": "java", "python": "py"}

SUPPORTED_LLM_API_MAP = {
    "gpt-4o": "openai/gpt-4o",
    "gemini-flash-2.5": "google/gemini-2.5-flash",
    "llama-4-maverick": "meta-llama/llama-4-maverick:free",
    "qwen-2.5-coder": "qwen/qwen-2.5-coder-32b-instruct:free",
    "qwen-2.5": "qwen/qwen-2.5-72b-instruct:free",
    "deepseek-r1": "deepseek/deepseek-r1:free",
    "deepseek-v3.1": "deepseek/deepseek-chat-v3.1:free"
}

SUPPORTED_LANGUAGE_LIST = list(SUPPORTED_LANGUAGE_EXTENSION_MAP.keys())

SUPPORTED_LLM_LIST = list(SUPPORTED_LLM_API_MAP.keys())
