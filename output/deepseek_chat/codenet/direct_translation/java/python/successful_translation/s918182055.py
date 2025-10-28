
import sys
import heapq

def main():
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    M = int(data[1])
    list = [[] for _ in range(100001)]
    idx = 2
    for _ in range(N):
        a = int(data[idx])
        b = int(data[idx+1])
        list[a].append(b)
        idx += 2
    res = 0
    heap = []
    for i in range(1, M+1):
        if list[i]:
            for val in list[i]:
                heapq.heappush(heap, -val)
        if heap:
            res += -heapq.heappop(heap)
    print(res)

if __name__ == "__main__":
    main()

