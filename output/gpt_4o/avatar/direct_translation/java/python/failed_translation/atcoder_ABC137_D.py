
import heapq

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __lt__(self, other):
        if self.a == other.a:
            return self.b < other.b
        return self.a < other.a

def main():
    import sys
    input = sys.stdin.read
    data = input().split('\u2581')
    N = int(data[0])
    M = int(data[1])
    
    q = []
    for i in range(N):
        a, b = int(data[2 + 2 * i]), int(data[3 + 2 * i])
        heapq.heappush(q, Job(a, b))
    
    cnt = 0
    jobQ = []

    for i in range(1, M + 1):
        while q and q[0].a <= i:
            job = heapq.heappop(q)
            heapq.heappush(jobQ, -job.b)
        if jobQ:
            cnt += -heapq.heappop(jobQ)
    
    print(cnt)

main()

