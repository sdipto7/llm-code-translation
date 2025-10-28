
import sys

input = sys.stdin.read().split()
N = int(input[0])
Q = int(input[1])
s = input[2]
pre = [0] * (N + 1)
for i in range(1, N):
    if s[i - 1] == 'A' and s[i] == 'C':
        pre[i] = 1
for i in range(1, N):
    pre[i] += pre[i - 1]
index = 3
for _ in range(Q):
    l = int(input[index])
    r = int(input[index + 1])
    index += 2
    r -= 1
    print(pre[r] - pre[l - 1])

