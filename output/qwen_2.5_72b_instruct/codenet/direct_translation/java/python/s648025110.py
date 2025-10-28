
import sys

n = int(sys.stdin.readline().strip())
h = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
out = 0

for i in range(n):
    if out < h[i]:
        ans += h[i] - out
        out = h[i]
    else:
        out = h[i]

print(ans)

