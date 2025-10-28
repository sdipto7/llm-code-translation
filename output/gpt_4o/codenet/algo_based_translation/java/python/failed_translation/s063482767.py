
import heapq
import sys

def main():
    sc = sys.stdin
    n = int(sc.readline().strip())
    queue = []
    
    for _ in range(n):
        num = int(sc.readline().strip())
        heapq.heappush(queue, num)
    
    sum = 0
    for _ in range(n - 1):
        sum += heapq.heappop(queue)
    
    last_element = heapq.heappop(queue)
    
    if last_element < sum:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

