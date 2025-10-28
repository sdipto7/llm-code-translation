
import math

N, D = map(int, input().split())
vector = [list(map(int, input().split())) for _ in range(N)]
answer = 0

for i in range(N - 1):
    for j in range(i + 1, N):
        dist = sum((vector[i][d] - vector[j][d]) ** 2 for d in range(D))
        sq = math.sqrt(dist)
        if abs(sq - math.floor(sq)) < 0.001:
            answer += 1

print(answer)

