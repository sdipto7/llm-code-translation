
import sys

data = list(map(int, sys.stdin.read().split()))
n, k = data[0], data[1]
arr = data[2:2 + n]

l = 0
c = 1

for a in arr:
    if a == l:
        c += 1
    else:
        c = 1
    l = a

print(n - c if c + k > n else -1)

