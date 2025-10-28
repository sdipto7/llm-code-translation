
import heapq

def main():
    import sys
    input = sys.stdin.read().split('\u2581')
    ptr = 0
    N = int(input[ptr])
    ptr += 1
    M = int(input[ptr])
    ptr += 1
    
    q = []
    for _ in range(N):
        a = int(input[ptr])
        ptr += 1
        b = int(input[ptr])
        ptr += 1
        heapq.heappush(q, (a, b))
    
    job_q = []
    cnt = 0
    
    for i in range(1, M + 1):
        while q and q[0][0] <= i:
            a, b = heapq.heappop(q)
            heapq.heappush(job_q, -b)
        if job_q:
            cnt += -heapq.heappop(job_q)
    
    print(cnt)

if __name__ == "__main__":
    main()

