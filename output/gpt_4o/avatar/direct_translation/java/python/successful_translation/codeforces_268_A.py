
n = int(input())
result = 0
h = []
g = []
for _ in range(n):
    hi, gi = map(int, input().split())
    h.append(hi)
    g.append(gi)
for i in range(n):
    for j in range(n):
        if h[i] == g[j]:
            result += 1
print(result)

