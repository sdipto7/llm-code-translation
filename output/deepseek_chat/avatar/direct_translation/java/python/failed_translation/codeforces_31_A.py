
import sys

n = int(sys.stdin.readline())
a = [int(sys.stdin.readline()) for _ in range(n)]
f = 0

for k in range(n):
    t = a[k]
    for i in range(n):
        for j in range(n - 1):
            if i != j and t == (a[i] + a[j]):
                f = 1
                break
        if f:
            break
    if f:
        break

if f:
    print(k + 1, j + 1, i + 1)
else:
    print(-1)

