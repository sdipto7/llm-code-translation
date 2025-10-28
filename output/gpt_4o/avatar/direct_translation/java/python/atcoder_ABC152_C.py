
import heapq

def solve():
    n = int(input())
    arr = list(map(int, input().split()))
    sum_ = 0
    q = []
    
    for i in range(n):
        heapq.heappush(q, arr[i])
        if arr[i] <= q[0]:
            sum_ += 1

    return sum_

print(solve())

