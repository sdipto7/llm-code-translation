
import sys

x, y, a, b = map(int, sys.stdin.readline().split())
j, c, ans = 2, max(x, y), True
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
    i = a
    while i <= b:
        if i % c == 0:
            break
        i += 1
    if i != b + 1:
        print((b - i) // c + 1)
    else:
        print("0")

