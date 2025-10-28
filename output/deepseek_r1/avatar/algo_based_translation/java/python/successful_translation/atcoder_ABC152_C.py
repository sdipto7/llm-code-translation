
import heapq

def solve():
    n = int(input())
    arr = list(map(int, input().split()))
    sum_val = 0
    heap = []
    for num in arr:
        heapq.heappush(heap, num)
        if num <= heap[0]:
            sum_val += 1
    return sum_val

print(solve())

