
n, a, b = map(int, input().split())
sa = abs(a - b)
if sa % 2 == 0:
    print(sa // 2)
else:
    aaa = min(n - a, a - 1)
    bbb = min(n - b, b - 1)
    ans = min(aaa, bbb) + 1 + (sa - 1) // 2
    print(ans)

