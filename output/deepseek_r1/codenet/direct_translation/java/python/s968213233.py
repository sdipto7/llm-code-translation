import heapq

n = int(input())
a = list(map(int, input().split()))
a.sort()
res = 0
heap = []
heapq.heappush(heap, (-a[-1], (a[-1], a[-1])))

for i in reversed(range(n-1)):
    current_a = a[i]
    key, (x, y) = heapq.heappop(heap)
    res += min(x, y)
    pair1 = (x, current_a)
    pair2 = (current_a, y)
    heapq.heappush(heap, (-min(pair1), pair1))
    heapq.heappush(heap, (-min(pair2), pair2))

print(res)
