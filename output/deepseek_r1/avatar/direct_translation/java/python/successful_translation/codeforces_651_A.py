a, b = map(int, input().split())
if a == 1 and b == 1:
    print(0)
else:
    c = 0
    while a >= 1 or b >= 1:
        if a >= b:
            a -= 2
            b += 1
        else:
            a += 1
            b -= 2
        if a <= 0 or b <= 0:
            c += 1
            break
        c += 1
    print(c)
