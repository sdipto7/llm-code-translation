
import sys
N, Q = map(int, sys.stdin.readline().split())
s = sys.stdin.readline().strip()
pre = [0] * (N + 1)
for i in range(1, N):
    if s[i-1] == 'A' and s[i] == 'C':
        pre[i] = 1
for i in range(1, N):
    pre[i] += pre[i-1]
for _ in range(Q):
    l, r = map(int, sys.stdin.readline().split())
    print(pre[r-1] - pre[l-1])

