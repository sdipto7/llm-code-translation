
import sys
import bisect

mod = 10**9 + 7
n = int(sys.stdin.readline())
k = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
a.sort()

INF = 10**18 + 1
l = -INF
r = INF

while l + 1 < r:
    c = (l + r) // 2
    tot = 0
    for i in range(n):
        now = a[i]
        if now >= 0:
            idx = bisect.bisect_left(a, (c + now - 1) // now)
            tot += n - idx
        else:
            idx = bisect.bisect_right(a, c // now)
            tot += idx
        if a[i] * a[i] < c:
            tot -= 1
    tot //= 2
    if tot < k:
        r = c
    else:
        l = c
print(l)

