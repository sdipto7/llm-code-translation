
n = int(input())
h = []
g = []
for _ in range(n):
    a, b = map(int, input().split())
    h.append(a)
    g.append(b)
result = 0
for i in range(n):
    for j in range(n):
        if h[i] == g[j]:
            result += 1
print(result)

