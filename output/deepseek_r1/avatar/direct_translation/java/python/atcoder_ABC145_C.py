
n = int(input())
pos = [list(map(int, input().split())) for _ in range(n)]
total = 0.0
for i in range(n):
    for j in range(n):
        if i == j:
            continue
        dx = pos[i][0] - pos[j][0]
        dy = pos[i][1] - pos[j][1]
        total += (dx**2 + dy**2) ** 0.5
print(total / n)

