import heapq

N, M = map(int, input().split())
q = []
for _ in range(N):
    a, b = map(int, input().split())
    heapq.heappush(q, (a, b))

cnt = 0
jobQ = []
for i in range(1, M + 1):
    while q and q[0][0] <= i:
        a, b = heapq.heappop(q)
        heapq.heappush(jobQ, -b)
    if jobQ:
        cnt += -heapq.heappop(jobQ)

print(cnt)
