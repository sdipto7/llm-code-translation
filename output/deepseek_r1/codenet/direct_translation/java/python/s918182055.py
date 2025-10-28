
import heapq

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    
    N = int(input[ptr])
    ptr += 1
    M = int(input[ptr])
    ptr += 1
    
    days = [[] for _ in range(100001)]
    
    for _ in range(N):
        a = int(input[ptr])
        ptr += 1
        b = int(input[ptr])
        ptr += 1
        days[a].append(b)
    
    heap = []
    res = 0
    
    for i in range(1, M + 1):
        for b in days[i]:
            heapq.heappush(heap, -b)
        if heap:
            res += -heapq.heappop(heap)
    
    print(res)

if __name__ == "__main__":
    main()

