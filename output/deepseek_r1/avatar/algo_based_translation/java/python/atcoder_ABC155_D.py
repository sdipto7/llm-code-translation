
import bisect

n, k = map(int, input().split())
a = list(map(int, input().split()))
a.sort()

INF = 10**18 + 1
l = -INF
r = INF

def check(x):
    tot = 0
    for i in range(n):
        now = a[i]
        if now >= 0:
            left = 0
            right = n
            while left < right:
                mid = (left + right) // 2
                if now * a[mid] < x:
                    left = mid + 1
                else:
                    right = mid
            tot += left
        else:
            left = 0
            right = n
            while left < right:
                mid = (left + right) // 2
                if now * a[mid] >= x:
                    left = mid + 1
                else:
                    right = mid
            tot += (n - left)
        if now * now < x:
            tot -= 1
    return (tot // 2) < k

while l + 1 < r:
    mid = (l + r) // 2
    if check(mid):
        l = mid
    else:
        r = mid

print(l)

