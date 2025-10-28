x, t, a, b, da, db = map(int, input().split())
ok = False
for i in range(t):
    first = a - da * i
    for j in range(t):
        second = b - db * j
        if first + second == x or first == x or second == x or x == 0:
            ok = True
            break
if ok:
    print("YES")
else:
    print("NO")
