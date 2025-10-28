import math

n = int(input())
x = []
y = []
for _ in range(n):
    a, b = map(int, input().split())
    x.append(a)
    y.append(b)

for i in range(n):
    thetas = []
    for j in range(n):
        if i == j:
            continue
        dx = x[j] - x[i]
        dy = y[j] - y[i]
        angle = math.atan2(dy, dx)
        thetas.append(angle)
    thetas.sort()
    thetas.append(thetas[0] + 2 * math.pi)
    max_val = 0.0
    for k in range(len(thetas) - 1):
        diff = thetas[k+1] - thetas[k]
        current = diff - math.pi
        if current > max_val:
            max_val = current
    print(max_val / (2 * math.pi))
