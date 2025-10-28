
import heapq

n = int(input())
arr = list(map(int, input().split()))
count = 0
heap = []
for num in arr:
    heapq.heappush(heap, num)
    if num == heap[0]:
        count += 1
print(count)

