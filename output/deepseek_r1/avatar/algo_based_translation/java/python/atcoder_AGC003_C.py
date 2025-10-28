
import heapq
import sys

data = list(map(int, sys.stdin.read().split()))
N = data[0]
elements = data[1:N+1]

index_map = {}
for i in range(N):
    num = elements[i]
    index_map[num] = i

heap = elements.copy()
heapq.heapify(heap)

current_bin = 0
diff = 0

while heap:
    num = heapq.heappop(heap)
    idx = index_map[num]
    if (current_bin % 2) != (idx % 2):
        diff += 1
    current_bin += 1
    current_bin %= 2

ans = diff // 2
print(ans)

