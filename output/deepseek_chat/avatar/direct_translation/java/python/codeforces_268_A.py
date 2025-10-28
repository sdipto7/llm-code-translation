
import sys

n = int(sys.stdin.readline())
result = 0
h = [0] * n
g = [0] * n

for i in range(n):
    h[i], g[i] = map(int, sys.stdin.readline().split())

for i in range(n):
    for j in range(n):
        if h[i] == g[j]:
            result += 1

print(result)

