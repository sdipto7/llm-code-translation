
import sys
import heapq

def main():
    print(solve())

def solve():
    N = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    
    sum_val = 0
    heap = []
    
    for i in range(len(arr)):
        heapq.heappush(heap, arr[i])
        if arr[i] <= heap[0]:
            sum_val += 1
            
    return sum_val

if __name__ == "__main__":
    main()

