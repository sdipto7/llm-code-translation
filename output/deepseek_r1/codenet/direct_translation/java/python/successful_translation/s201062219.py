
import sys

a = []
tokens = sys.stdin.read().split()
token_gen = iter(tokens)

try:
    while True:
        c = int(next(token_gen))
        mark = next(token_gen)
        b = int(next(token_gen))
        if mark == '?':
            a.append(2000001)
            break
        elif mark == '+':
            a.append(c + b)
        elif mark == '-':
            a.append(c - b)
        elif mark == '*':
            a.append(c * b)
        elif mark == '/':
            a.append(c // b if c * b >= 0 else (c // b) + 1)
except StopIteration:
    pass

for num in a:
    if num == 2000001:
        break
    print(num)

