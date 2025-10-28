
import heapq

n = int(input())
queue = []
for _ in range(n):
    heapq.heappush(queue, int(input()))
sum_val = sum(heapq.heappop(queue) for _ in range(n - 1))
print("Yes" if heapq.heappop(queue) < sum_val else "No")

