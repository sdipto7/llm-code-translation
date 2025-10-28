
def main():
    import sys
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().split()))
    if len(a) != n:
        a = list(map(int, sys.stdin.read().split()))
        a = a[:n]
    ans = 0
    for i in range(1, n-1):
        local_min = min(a[i-1], a[i], a[i+1])
        local_max = max(a[i-1], a[i], a[i+1])
        if a[i] != local_min and a[i] != local_max:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()

