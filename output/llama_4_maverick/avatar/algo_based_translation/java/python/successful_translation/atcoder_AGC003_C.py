
import heapq
N = int(input())
nums = []
idx_map = {}
for i in range(N):
    num = int(input())
    nums.append(num)
    idx_map[num] = i
nums.sort()
bin = 0
diff = 0
for num in nums:
    idx = idx_map[num]
    if (bin % 2) != (idx % 2):
        diff += 1
    bin += 1
    bin %= 2
ans = diff // 2
print(ans)

