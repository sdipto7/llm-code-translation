
import sys
N, K = map(int, sys.stdin.readline().split())
S = list(map(int, sys.stdin.readline().split()))
S.sort()
temp = 0
ans = 10 ** 9
if K == 1:
    for i in range(N):
        temp = S
