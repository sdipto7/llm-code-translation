
import sys

def fun(arr, q, n, m):
    res = 0
    i = 0
    j = n
    while i <= j:
        md = i + (j - i) // 2
        if arr[md] == q:
            return md
        elif arr[md] > q:
            res = md
            j = md - 1
        else:
            i = md + 1
    return res

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
arr = [data[ptr]]
ptr += 1
for i in range(1, n):
    x = data[ptr]
    ptr += 1
    arr.append(arr[-1] + x)
m = data[ptr]
ptr += 1
q = data[ptr:ptr+m]
ptr += m

for k in range(m):
    print(fun(arr, q[k], n, m) + 1)

