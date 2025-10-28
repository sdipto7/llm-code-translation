n = int(input())
l = []
r = []
for _ in range(n):
    a, b = map(int, input().split())
    l.append(a)
    r.append(b)
total = 0
for i in range(n):
    total += r[i] - l[i] + 1
print(total)
