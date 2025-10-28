import sys
import bisect

mod = 1000000007
DX = [-1, 0, 1, 0]
DY = [0, -1, 0, 1]
n = 0
k = 0
a = []
INF = 1000000000000000001

def check(x):
    tot = 0
    for i in range(n):
        now = a[i]
        if now >= 0:
            l = bisect.bisect_left(a, x / now)
            tot += l
        else:
            l = bisect.bisect_right(a, x / now)
            tot += (n - l)
        if now * now < x:
            tot -= 1
    return tot // 2 < k

def main():
    global n, k, a
    input = sys.stdin.read().split()
    n = int(input[0])
    k = int(input[1])
    a = list(map(int, input[2:]))
    a.sort()
    l = -INF
    r = INF
    while l + 1 < r:
        c = (l + r) // 2
        if check(c):
            l = c
        else:
            r = c
    print(l)

if __name__ == "__main__":
    main()
