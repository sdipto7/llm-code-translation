
import heapq
from sys import stdin

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __lt__(self, other):
        if self.a == other.a:
            return self.b < other.b
        return self.a < other.a

def main():
    N, M = map(int, stdin.readline().split())
    q = []
    for _ in range(N):
        a, b = map(int, stdin.readline().split())
        heapq.heappush(q, Job(a, b))

    cnt = 0
    jobQ = []
    for i in range(1, M + 1):
        while q and q[0].a <= i:
            job = heapq.heappop(q)
            heapq.heappush(jobQ, -job.b)
        if jobQ:
            cnt -= heapq.heappop(jobQ)

    print(cnt)

if __name__ == "__main__":
    main()

