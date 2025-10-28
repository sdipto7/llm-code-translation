word = input().strip()
uppercase = sum(1 for ch in word if ch.isupper())
lowercase = len(word) - uppercase
print(word.upper() if uppercase > lowercase else word.lower())
