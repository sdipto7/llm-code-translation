
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
k = data[ptr]
ptr += 1
arr = data[ptr:ptr + n]
ptr += n
o = arr.count(1)
e = n - o
res = []
for _ in range(k):
    l = data[ptr]
    ptr += 1
    r = data[ptr]
    ptr += 1
    size = r - l + 1
    if size % 2 != 0:
        res.append('0\n')
    else:
        req = size // 2
        if o >= req and e >= req:
            res.append('1\n')
        else:
            res.append('0\n')
print(''.join(res), end='')

