
import heapq
import sys

data = list(map(int, sys.stdin.read().split()))
N = data[0]
A = data[1:N+1]
A.sort()

res = 0
heap = []
heapq.heappush(heap, (-A[-1], (A[-1], A[-1])))

for i in range(N-2, -1, -1):
    a = A[i]
    current = heapq.heappop(heap)
    place = current[1]
    res += min(place)
    for pair in [(place[0], a), (a, place[1])]:
        heapq.heappush(heap, (-min(pair), pair))

print(res)

