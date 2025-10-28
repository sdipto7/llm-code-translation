
import sys
import math

mod = int(1e9) + 7
DX = [-1, 0, 1, 0]
DY = [0, -1, 0, 1]
n = 0
k = 0
a = []

def main():
    global n, k, a
    input = sys.stdin.read().split()
    n = int(input[0])
    k = int(input[1])
    a = list(map(int, input[2:]))
    a.sort()
    INF = int(1e18) + 1
    l = -INF
    r = INF
    while l + 1 < r:
        c = (l + r) // 2
        if check(c):
            l = c
        else:
            r = c
    print(l)

def check(x):
    tot = 0
    for i in range(n):
        now = a[i]
        l = 0
        r = n
        if now >= 0:
            while l < r:
                c = (l + r) // 2
                if now * a[c] < x:
                    l = c + 1
                else:
                    r = c
            tot += l
        else:
            while l < r:
                c = (l + r) // 2
                if now * a[c] >= x:
                    l = c + 1
                else:
                    r = c
            tot += (n - l)
        if now * now < x:
            tot -= 1
    if tot // 2 < k:
        return True
    else:
        return False

if __name__ == "__main__":
    main()

