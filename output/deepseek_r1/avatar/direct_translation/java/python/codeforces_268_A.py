n = int(input())
h = []
g = []
for _ in range(n):
    a, b = map(int, input().split())
    h.append(a)
    g.append(b)
print(sum(g.count(x) for x in h))
