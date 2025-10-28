
import sys

def func(a):
    min_val = 0
    i = 0
    while i < len(a):
        if a[i] == 0:
            del a[i]
        else:
            if min_val != 0:
                mod = a[i] % min_val
                a[i] = mod
                if mod == 1:
                    print(1)
                    sys.exit()
                i += 1
            else:
                min_val = a[i]
                i += 1
    a.sort()
    return a

data = list(map(int, sys.stdin.read().split()))
n = data[0]

if n == 1:
    print(data[1])
    sys.exit()

a = data[1:n+1]
a.sort()

if a[-1] == 0:
    print(0)
    sys.exit()

ans = 0
while True:
    if len(a) == 1:
        ans = a[0]
        break
    a = func(a)

print(ans)

