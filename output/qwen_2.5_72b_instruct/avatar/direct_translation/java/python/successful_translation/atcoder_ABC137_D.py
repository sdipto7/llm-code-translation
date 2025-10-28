import sys
import heapq

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __lt__(self, other):
        if self.a == other.a:
            return self.b > other.b
        return self.a < other.a

def main():
    input = sys.stdin.read().split()
    N = int(input[0])
    M = int(input[1])
    q = []
    idx = 2
    for _ in range(N):
        a = int(input[idx])
        b = int(input[idx + 1])
        heapq.heappush(q, Job(a, b))
        idx += 2
    cnt = 0
    jobQ = []
    for i in range(1, M + 1):
        while q and q[0].a <= i:
            job = heapq.heappop(q)
            heapq.heappush(jobQ, -job.b)
        if jobQ:
            cnt -= heapq.heappop(jobQ)
    print(cnt)

main()
