
import sys
import heapq

def solve():
    N = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    sum = 0
    q = []
    for num in arr:
        heapq.heappush(q, num)
        if num <= q[0]:
            sum += 1
    return sum

if __name__ == "__main__":
    print(solve())

