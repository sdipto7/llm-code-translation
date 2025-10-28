
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
while ptr < len(data):
    n = data[ptr]
    ptr += 1
    a = data[ptr:ptr + n]
    ptr += n
    b = [0] * n
    s = -1
    tem = 1
    q = 0
    while q != n:
        s += 1
        if tem == 1:
            for i in range(n):
                if a[i] <= q and b[i] == 0:
                    b[i] = 1
                    q += 1
            tem = 0
        else:
            for i in reversed(range(n)):
                if a[i] <= q and b[i] == 0:
                    b[i] = 1
                    q += 1
            tem = 1
    print(s)

