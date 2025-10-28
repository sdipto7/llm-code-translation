
import heapq

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    N = int(input[ptr])
    ptr += 1
    M = int(input[ptr])
    ptr += 1

    list_ = [None] * 100001
    for _ in range(N):
        a = int(input[ptr])
        ptr += 1
        b = int(input[ptr])
        ptr += 1
        if list_[a] is None:
            list_[a] = []
        list_[a].append(b)
    
    res = 0
    pqueue = []
    for i in range(1, M + 1):
        if list_[i] is not None:
            for val in list_[i]:
                heapq.heappush(pqueue, -val)
        if pqueue:
            res += -heapq.heappop(pqueue)
    print(res)

if __name__ == "__main__":
    main()

