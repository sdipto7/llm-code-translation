
import math

N, D = map(int, input().split())
vectors = [list(map(int, input().split())) for _ in range(N)]
answer = 0

for i in range(N-1):
    for j in range(i+1, N):
        dist = sum((vectors[i][d] - vectors[j][d]) ** 2 for d in range(D))
        sq = math.sqrt(dist)
        answer += 1 if abs(sq - round(sq)) < 0.001 else 0

print(answer)

