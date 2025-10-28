a, b, c, d = map(int, input().split())
if c > b:
    print(0)
elif a > d:
    print(0)
elif a < c:
    print(min(b, d) - c)
else:
    l = sorted([a, b, c, d])
    print(l[2] - l[1])
