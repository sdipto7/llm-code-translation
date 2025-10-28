
import sys
import heapq

def main():
    input = sys.stdin.buffer.readline
    N, M = map(int, input().split())
    list = [[] for _ in range(100001)]
    for _ in range(N):
        a, b = map(int, input().split())
        list[a].append(b)

    res = 0
    pqueue = []
    for i in range(1, M + 1):
        if list[i]:
            for x in list[i]:
                heapq.heappush(pqueue, -x)
        if pqueue:
            res += -heapq.heappop(pqueue)

    print(res)

if __name__ == "__main__":
    main()

