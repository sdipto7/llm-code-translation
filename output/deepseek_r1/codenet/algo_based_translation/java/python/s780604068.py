
import sys

data = list(map(int, sys.stdin.read().split()))
N = data[0]
map_arr = data[1:1 + 2 * N]
map_sorted = sorted(map_arr)
max_sum = 0
for i in range(0, 2 * N, 2):
    max_sum += min(map_sorted[i], map_sorted[i + 1])
print(max_sum)

