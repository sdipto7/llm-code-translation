
import sys
import heapq

class MyScanner:
    def __init__(self, input):
        self.input = input
        self.tokens = []
    def read(self):
        while not self.tokens:
            self.tokens = self.input.readline().strip().split()
        return self.tokens.pop(0)
    def next(self):
        return self.read()
    def nextInt(self):
        return int(self.read())
    def nextLong(self):
        return int(self.read())
    def nextDouble(self):
        return float(self.read())

class MyWriter:
    def __init__(self, output):
        self.output = output
    def println(self, x):
        self.output.write(str(x) + '\n')
    def flush(self):
        self.output.flush()

out = MyWriter(sys.stdout)
sc = MyScanner(sys.stdin)
N = sc.nextInt()
M = sc.nextInt()
list = [None] * 100001

for i in range(N):
    a = sc.nextInt()
    b = sc.nextInt()
    if list[a] is None:
        list[a] = []
    list[a].append(b)

res = 0
pqueue = []
for i in range(1, M + 1):
    if list[i] is not None:
        for val in list[i]:
            heapq.heappush(pqueue, -val)
    if pqueue:
        res -= heapq.heappop(pqueue)

out.println(res)
out.flush()

