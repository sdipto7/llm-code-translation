
x, y, a, b = map(int, input().split())
ans = True
c = max(x, y)
if c > b:
    print(0)
    ans = False
j = 2
min_val = min(x, y)
while ans and c % min_val != 0:
    if x > y:
        c = x * j
    else:
        c = y * j
    j += 1
    if c > b:
        print(0)
        ans = False
        break
if ans:
    i = a
    while i <= b and i % c != 0:
        i += 1
    print((b - i) // c + 1 if i <= b else 0)

