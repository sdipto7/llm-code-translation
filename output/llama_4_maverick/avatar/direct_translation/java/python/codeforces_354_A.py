
import sys
N, L, R, QL, QR = map(int, sys.stdin.readline().split())
W = list(map(int, sys.stdin.readline().split()))
sum = [0] * (N + 1)
for n in range(N):
    sum[n + 1] = sum[n] + W[n]
min_val = float('inf')
for firstR in range(N + 1):
    lCount = firstR
    rCount = N - lCount
    cand = sum[lCount] * L + (sum[N] - sum[lCount]) * R
    llCount = max(0, lCount - rCount - 1)
    rrCount = max(0, rCount - lCount - 1)
    cand += llCount * QL
    cand += rrCount * QR
    min_val = min(cand, min_val)
print(min_val)

