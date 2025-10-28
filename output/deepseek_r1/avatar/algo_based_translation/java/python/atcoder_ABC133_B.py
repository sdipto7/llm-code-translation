
import math

n, d = map(int, input().split())
vectors = [list(map(int, input().split())) for _ in range(n)]
answer = 0

for i in range(n):
    for j in range(i + 1, n):
        dist = 0
        for k in range(d):
            x = vectors[i][k] - vectors[j][k]
            dist += x * x
        sq = math.sqrt(dist)
        if abs(sq - math.floor(sq)) < 0.001:
            answer += 1

print(answer)

