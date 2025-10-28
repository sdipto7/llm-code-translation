a, b, c, x = map(int, input().split())
res = 0
for i in range(a + 1):
    for j in range(b + 1):
        for k in range(c + 1):
            if 500 * i + 100 * j + 50 * k == x:
                res += 1
print(res)
