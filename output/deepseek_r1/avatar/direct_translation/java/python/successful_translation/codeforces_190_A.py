n, m = map(int, input().split())
if n == 0:
    print("Impossible" if m != 0 else "0 0")
else:
    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
    else:
        print(m, m + n - 1)
