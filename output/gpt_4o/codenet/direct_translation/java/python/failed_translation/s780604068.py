
N = int(input())

map_arr = [int(input()) for _ in range(N * 2)]

map_arr.sort()

max_sum = 0
for i in range(0, N * 2, 2):
    max_sum += min(map_arr[i], map_arr[i + 1])

print(max_sum)

