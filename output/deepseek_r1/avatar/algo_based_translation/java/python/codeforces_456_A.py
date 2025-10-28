
n = int(input())
temp = 0
q = 0
w = 0
e = 0
f = False

for _ in range(n):
    x, y = map(int, input().split())
    
    if temp < x:
        if q > y:
            f = True
        q = y
        temp = x
    elif temp > x:
        if q < y:
            f = True
        q = y
        temp = x
    
    if x > w:
        if y < e:
            f = True
        w = x
        e = y
    if x < w:
        if y > e:
            f = True

print("Happy Alex" if f else "Poor Alex")

