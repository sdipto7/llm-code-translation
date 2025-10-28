
n = int(input())
nums = list(map(int, input().split()))[:n]
count_map = {}
for a in nums:
    count_map[a] = count_map.get(a, 0) + 1
ans = sum(1 for cnt in count_map.values() if cnt % 2 == 1)
print(ans)

