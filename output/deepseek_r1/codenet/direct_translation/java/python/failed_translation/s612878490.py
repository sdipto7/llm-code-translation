
n, m = map(int, input().split())
shortages = []
for _ in range(m):
    a = int(input())
    shortages.append(max(n - a, 0))
shortages.sort()
print(sum(shortages[:-1]))

