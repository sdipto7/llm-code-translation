
import sys
import bisect

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    a = list(map(int, data[2:2+n]))
    a.sort()
    
    INF = 10**18 + 1
    l = -INF
    r = INF
    
    def check(x):
        tot = 0
        for i in range(n):
            now = a[i]
            if now >= 0:
                pos = bisect.bisect_left(a, (x + now - 1) // now)
                tot += pos
            else:
                pos = bisect.bisect_left(a, (x - now - 1) // (-now))
                tot += (n - pos)
            if now * now < x:
                tot -= 1
        return tot // 2 < k
    
    while l + 1 < r:
        mid = (l + r) // 2
        if check(mid):
            l = mid
        else:
            r = mid
            
    print(l)

if __name__ == "__main__":
    main()

