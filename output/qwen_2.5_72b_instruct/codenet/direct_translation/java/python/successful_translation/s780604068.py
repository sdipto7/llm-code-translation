
import sys
input = sys.stdin.read
data = input().split()

N = int(data[0])
map = list(map(int, data[1:]))

map.sort()

max_sum = 0
for i in range(0, N * 2, 2):
    max_sum += min(map[i], map[i + 1])

print(max_sum)

