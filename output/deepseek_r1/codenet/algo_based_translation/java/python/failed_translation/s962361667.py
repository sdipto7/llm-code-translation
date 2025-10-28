
import sys

w, n = map(int, sys.stdin.readline().split())
values = [i + 1 for i in range(w)]
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split(','))
    a -= 1
    b -= 1
    x = values[a]
    values[a] = values[b]
    values[b] = x
for num in values:
    print(num)

