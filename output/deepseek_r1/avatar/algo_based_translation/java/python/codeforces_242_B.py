
import sys

INF = 10**9 + 5

n = int(input())
a = []
b = []
left = INF
right = 0

for _ in range(n):
    x, y = map(int, input().split())
    a.append(x)
    b.append(y)
    left = min(left, x)
    right = max(right, y)

for i in range(n):
    if a[i] == left and b[i] == right:
        print(i + 1)
        sys.exit()

print(-1)

