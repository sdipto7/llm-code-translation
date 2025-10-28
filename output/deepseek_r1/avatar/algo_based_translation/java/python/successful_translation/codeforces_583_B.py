
import sys

data = list(map(int, sys.stdin.read().split()))
idx = 0

while idx < len(data):
    n = data[idx]
    idx += 1
    a = data[idx:idx + n]
    idx += n
    b = [0] * n
    s = -1
    tem = 1
    q = 0
    while q < n:
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

