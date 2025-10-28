
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
N = data[ptr]
ptr += 1
X = data[ptr]
ptr += 1
m = [0] * N
m[0] = data[ptr]
ptr += 1
X -= m[0]
min_val = m[0]
for i in range(1, N):
    m[i] = data[ptr]
    ptr += 1
    X -= m[i]
    if m[i] < min_val:
        min_val = m[i]
print(N + X // min_val)

