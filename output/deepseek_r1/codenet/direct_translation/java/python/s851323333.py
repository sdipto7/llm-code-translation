
import sys

stack = []
tokens = []
for line in sys.stdin:
    tokens.extend(line.split())

for token in tokens:
    try:
        num = int(token)
    except ValueError:
        break
    if num == 0:
        print(stack.pop())
    else:
        stack.append(num)

