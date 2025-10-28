
import sys
from collections import deque, defaultdict, PriorityQueue

class MyScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = []
        self.token = None

    def _read(self):
        self.buffer = list(self.file.readline().split())
        if not self.buffer:
            self.token = None
        else:
            self.token = self.buffer.pop(0)

    def next(self):
        if self.token is None:
            self._read()
        ret = self.token
        self.token = None
        return ret

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextCharArray(self, n):
        return list(self.next())

    def next2dCharArray(self, n, m):
        return [self.nextCharArray(m) for _ in range(n)]

class MyWriter:
    def __init__(self, file):
        self.file = file

    def println(self, s):
        self.file.write(str(s) + '\n')

    def flush(self):
        self.file.flush()

def main():
    out = MyWriter(sys.stdout)
    sc = MyScanner(sys.stdin)
    N = sc.nextInt()
    M = sc.nextInt()
    list_ = defaultdict(deque)

    for _ in range(N):
        a = sc.nextInt()
        b = sc.nextInt()
        list_[a].append(b)

    res = 0
    pqueue = PriorityQueue(maxsize=100001)

    for i in range(1, M + 1):
        if list_[i]:
            for val in list_[i]:
                pqueue.put(-val)
        if not pqueue.empty():
            res -= pqueue.get()

    out.println(res)
    out.flush()

if __name__ == "__main__":
    main()

