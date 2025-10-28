import sys
import math

INF = int(1e9) + 5

n = int(input())
a = []
b = []
left = INF
right = 0

for i in range(n):
    ai, bi = map(int, input().split())
    a.append(ai)
    b.append(bi)
    left = min(left, ai)
    right = max(right, bi)

for i in range(n):
    if left == a[i] and right == b[i]:
        print(i + 1)
        sys.exit()

print(-1)
