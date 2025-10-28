import heapq

N, M = map(int, input().split(" \u2581 "))
heap = []
for _ in range(N):
    a, b = map(int, input().split(" \u2581 "))
    heapq.heappush(heap, (a, b))

job_queue = []
cnt = 0

for day in range(1, M + 1):
    while heap and heap[0][0] <= day:
        a, b = heapq.heappop(heap)
        heapq.heappush(job_queue, -b)
    if job_queue:
        cnt += -heapq.heappop(job_queue)

print(cnt)
