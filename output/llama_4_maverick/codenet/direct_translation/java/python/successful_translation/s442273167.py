
import sys
n = int(sys.stdin.readline().strip())
l = []
r = []
for _ in range(n):
    x, y = map(int, sys.stdin.readline().strip().split())
    l.append(x)
    r.append(y)
sum_val = sum(r[i] - l[i] + 1 for i in range(n))
print(sum_val)

