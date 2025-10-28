
import heapq

n = int(input())
nums = list(map(int, input().split()))
heapq.heapify(nums)

sum_ = 0
for _ in range(n - 1):
    sum_ += heapq.heappop(nums)

largest = heapq.heappop(nums)
print("Yes" if largest < sum_ else "No")

