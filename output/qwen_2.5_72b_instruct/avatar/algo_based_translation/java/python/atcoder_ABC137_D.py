import sys
from queue import PriorityQueue

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __lt__(self, other):
        if self.a == other.a:
            return self.b > other.b
        return self.a < other.a

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    M = int(data[1])
    index = 2
    
    q = PriorityQueue()
    for _ in range(N):
        a = int(data[index])
        b = int(data[index + 1])
        q.put(Job(a, b))
        index += 2
    
    cnt = 0
    jobQ = PriorityQueue()
    
    for i in range(1, M + 1):
        while not q.empty():
            job = q.queue[0]
            if job.a <= i:
                q.get()
                jobQ.put(-job.b)
            else:
                break
        if not jobQ.empty():
            cnt -= jobQ.get()
    
    print(cnt)

if __name__ == "__main__":
    main()
