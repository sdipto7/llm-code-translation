
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
m = data[ptr]
ptr += 1
A = []
for _ in range(n):
    row = data[ptr:ptr + m]
    ptr += m
    A.append(row)
b = data[ptr:ptr + m]
ptr += m
for row in A:
    print(sum(x * y for x, y in zip(row, b)))

