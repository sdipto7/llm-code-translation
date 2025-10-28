
import sys
word = sys.stdin.readline().strip()
uppercase = sum(1 for ch in word if ch.isupper())
lowercase = len(word) - uppercase
if uppercase > lowercase:
    print(word.upper())
elif lowercase > uppercase:
    print(word.lower())
else:
    print(word.lower())

