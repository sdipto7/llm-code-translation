n = int(input())
temp = 0
q = 0
w = 0
e = 0
f = False
for _ in range(n):
    a, b = map(int, input().split())
    if temp < a:
        if q > b:
            f = True
        q = b
        temp = a
    if temp > a:
        if q < b:
            f = True
        q = b
        temp = a
    if a > w:
        if b < e:
            f = True
        w = a
        e = b
    if a < w:
        if b > e:
            f = True
print("Happy Alex" if f else "Poor Alex")
