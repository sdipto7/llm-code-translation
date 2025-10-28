import heapq

sc = input()
n = int(sc)
queue = []
for i in range(n):
    heapq.heappush(queue, int(input()))
sum = 0
for i in range(n - 1):
    sum += heapq.heappop(queue)

print("Yes" if queue[0] < sum else "No")
