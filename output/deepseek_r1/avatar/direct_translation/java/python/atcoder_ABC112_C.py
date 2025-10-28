n = int(input())
x = []
y = []
h = []
for _ in range(n):
    a, b, c = map(int, input().split())
    x.append(a)
    y.append(b)
    h.append(c)

def check(n, x, y, h, cx, cy):
    for i in range(n):
        if h[i] > 0:
            ch = abs(x[i] - cx) + abs(y[i] - cy) + h[i]
            break
    else:
        return -1
    for i in range(n):
        if h[i] != max(ch - abs(x[i] - cx) - abs(y[i] - cy), 0):
            return -1
    return ch

for cx in range(101):
    for cy in range(101):
        res = check(n, x, y, h, cx, cy)
        if res != -1:
            print(cx, cy, res)
            exit()
