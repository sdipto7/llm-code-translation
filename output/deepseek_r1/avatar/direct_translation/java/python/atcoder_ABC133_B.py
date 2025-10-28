
import math

n, d = map(int, input().split())
vectors = [list(map(int, input().split())) for _ in range(n)]
answer = 0

for i in range(n - 1):
    for j in range(i + 1, n):
        dist = 0
        for k in range(d):
            dx = vectors[i][k] - vectors[j][k]
            dist += dx * dx
        s = math.sqrt(dist)
        if abs(s - math.floor(s)) < 0.001:
            answer += 1

print(answer)

