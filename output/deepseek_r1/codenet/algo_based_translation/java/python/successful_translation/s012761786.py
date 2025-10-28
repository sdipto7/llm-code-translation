
n, a, b = map(int, input().split())
sa = abs(a - b)
if sa % 2 == 0:
    ans = sa // 2
else:
    AAA = min(n - a, a - 1)
    BBB = min(n - b, b - 1)
    ans = min(AAA, BBB) + 1 + (sa - 1) // 2
print(ans)

