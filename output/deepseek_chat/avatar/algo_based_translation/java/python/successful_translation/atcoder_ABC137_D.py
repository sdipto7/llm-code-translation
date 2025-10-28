import heapq
import sys

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b
    
    def __lt__(self, other):
        if self.a == other.a:
            return self.b < other.b
        return self.a < other.a

def main():
    data = sys.stdin.read().splitlines()
    if not data:
        return
    
    first_line = data[0].split()
    N = int(first_line[0])
    M = int(first_line[1])
    
    q = []
    index = 1
    for i in range(N):
        line = data[index].split()
        index += 1
        a_val = int(line[0])
        b_val = int(line[1])
        heapq.heappush(q, Job(a_val, b_val))
    
    cnt = 0
    jobQ = []
    
    for i in range(1, M + 1):
        while q:
            job = q[0]
            if job.a <= i:
                popped_job = heapq.heappop(q)
                heapq.heappush(jobQ, -popped_job.b)
            else:
                break
        
        if jobQ:
            cnt += -heapq.heappop(jobQ)
    
    print(cnt)

if __name__ == "__main__":
    main()
