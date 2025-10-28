
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
N = data[ptr]
ptr += 1
L = data[ptr]
ptr += 1
R = data[ptr]
ptr += 1
QL = data[ptr]
ptr += 1
QR = data[ptr]
ptr += 1
W = data[ptr:ptr + N]

prefix = [0]
for w in W:
    prefix.append(prefix[-1] + w)

min_val = float('inf')

for firstR in range(N + 1):
    l_count = firstR
    r_count = N - l_count
    cand = prefix[l_count] * L + (prefix[-1] - prefix[l_count]) * R
    ll_count = max(0, l_count - r_count - 1)
    rr_count = max(0, r_count - l_count - 1)
    cand += ll_count * QL + rr_count * QR
    if cand < min_val:
        min_val = cand

print(min_val)

