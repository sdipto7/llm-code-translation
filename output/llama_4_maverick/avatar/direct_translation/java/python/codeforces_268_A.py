
n = int(input())
h = []
g = []
for _ in range(n):
    a, b = map(int, input().split())
    h.append(a)
    g.append(b)
result = sum(1 for i in h for j in g if i == j)
print(result)

