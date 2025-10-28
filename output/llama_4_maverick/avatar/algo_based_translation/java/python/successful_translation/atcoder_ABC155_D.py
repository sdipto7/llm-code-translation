
def check(x, a, n, k):
    tot = 0
    for i in range(n):
        now = a[i]
        l, r = 0, n
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

def main():
    n, k = map(int, input().split())
    a = sorted(list(map(int, input().split())))
    INF = 10**18 + 1
    l, r = -INF, INF
    while l + 1 < r:
        c = (l + r) // 2
        if check(c, a, n, k):
            l = c
        else:
            r = c
    print(l)

if __name__ == "__main__":
    main()

