
import sys
input = sys.stdin.read
data = input().split()

N = int(data[0])
L = int(data[1])
R = int(data[2])
QL = int(data[3])
QR = int(data[4])
W = list(map(int, data[5:5+N]))

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

