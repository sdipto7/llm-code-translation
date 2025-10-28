from collections import defaultdict

map = defaultdict(str)
n = int(input())
for _ in range(n):
    map[input()] = ""
print(len(map))
