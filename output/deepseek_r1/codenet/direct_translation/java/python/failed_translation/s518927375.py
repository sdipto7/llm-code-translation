k = int(input())
a = int(input())
b = int(input())

if b <= a + 2:
    print(1 + k)
else:
    x = k - (a - 1)
    ans = a + (x // 2) * (b - a) + (x % 1)
    print(ans)
