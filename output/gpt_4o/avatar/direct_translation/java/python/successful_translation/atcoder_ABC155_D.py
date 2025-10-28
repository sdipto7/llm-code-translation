
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    k = int(data[1])
    a = list(map(int, data[2:n+2]))
    
    a.sort()
    
    INF = int(1e18) + 1
    l = -INF
    r = INF
    
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
            if a[i] * a[i] < x:
                tot -= 1
        return tot // 2 < k
    
    while l + 1 < r:
        c = (l + r) // 2
        if check(c):
            l = c
        else:
            r = c
    
    print(l)

if __name__ == "__main__":
    main()

