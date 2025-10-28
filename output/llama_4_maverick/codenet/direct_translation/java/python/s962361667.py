
import sys
w, n = map(int, sys.stdin.readline().split())
values = list(range(1, w + 1))
for _ in range(n):
    a, b = map(lambda x: int(x) - 1, sys.stdin.readline().strip().split(','))
    values[a], values[b] = values[b], values[a]
for value in values:
    print(value)

