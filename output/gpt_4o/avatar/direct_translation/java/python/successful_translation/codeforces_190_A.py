
n, m = map(int, input().split())
if n == 0:
    if m != 0:
        print("Impossible")
    else:
        print(f"{0} {0}")
else:
    if m <= n:
        if m == 0:
            m = 1
        print(f"{n} {m + n - 1}")
    else:
        print(f"{m} {m + n - 1}")

