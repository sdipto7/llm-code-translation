
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
        if i != j:
            theta = math.atan2(y[j] - y[i], x[j] - x[i])
            thetas.append(theta)
    thetas.sort()
    if thetas:
        thetas.append(thetas[0] + 2 * math.pi)
    ans = 0.0
    for k in range(len(thetas) - 1):
        current = thetas[k+1] - thetas[k] - math.pi
        if current > ans:
            ans = current
    print(ans / (2 * math.pi))

