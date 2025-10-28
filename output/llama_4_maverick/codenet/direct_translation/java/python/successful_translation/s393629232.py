
import sys

n = int(sys.stdin.readline())
maxv = float('-inf')
minv = int(sys.stdin.readline())
for _ in range(n - 1):
    ri = int(sys.stdin.readline())
    maxv = max(maxv, ri - minv)
    minv = min(minv, ri)
print(maxv)

