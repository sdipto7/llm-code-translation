
s = input().split()
x = int(s[0])
y = int(s[1])
a = int(s[2])
b = int(s[3])
j = 2
c = max(x, y)
ans = True

if c > b:
    print("0")
    ans = False

while c % min(x, y) != 0 and ans:
    if x > y:
        c = x * j
        j += 1
    else:
        c = y * j
        j += 1
    if c > b:
        print("0")
        ans = False
        break

if ans:
    count = 0
    i = a
    for i in range(a, b + 1):
        if i % c == 0:
            break
    if i != b + 1:
        print((b - i) // c + 1)
    else:
        print("0")

