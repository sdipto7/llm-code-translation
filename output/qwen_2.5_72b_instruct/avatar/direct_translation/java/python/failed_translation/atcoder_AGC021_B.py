import math
import sys
input = sys.stdin.read
data = input().split()
N = int(data[0])
x = [0] * N
y = [0] * N
index = 1
for i in range(N):
    x[i] = int(data[index])
    y[i] = int(data[index + 1])
    index += 2
for i in range(N):
    thetas = []
    for j in range(N):
        if i == j:
            continue
        thetas.append(math.atan2(y[j] - y[i], x[j] - x[i]))
    thetas.sort()
    thetas.append(thetas[0] + 2 * math.pi)
    ans = 0
    for k in range(N - 1):
        ans = max(ans, thetas[k + 1] - thetas[k] - math.pi)
    print(ans / (math.pi * 2))
