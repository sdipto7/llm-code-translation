import heapq
import sys

def main():
    n = int(input().strip())
    heap = []
    for i in range(n):
        heapq.heappush(heap, int(input().strip()))
    
    sum_val = 0
    for i in range(n - 1):
        sum_val += heapq.heappop(heap)
    
    last_element = heapq.heappop(heap)
    print("Yes" if last_element < sum_val else "No")

if __name__ == "__main__":
    main()
