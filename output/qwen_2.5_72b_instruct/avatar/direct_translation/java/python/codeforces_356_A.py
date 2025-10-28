import sys
from collections import deque

class FastReader:
    def __init__(self):
        self.buffer = deque()
        self.stream = sys.stdin

    def next(self):
        while not self.buffer:
            self.buffer.extend(self.stream.readline().split())
        return self.buffer.popleft()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.stream.readline().strip()

in_ = FastReader()
n = in_.nextInt()
left = set(range(n))
answer = [0] * n
q = in_.nextInt()
while q > 0:
    l = in_.nextInt() - 1
    r = in_.nextInt() - 1
    win = in_.nextInt()
    while l in left and l <= r:
        curr = min(x for x in left if x >= l)
        answer[curr] = win
        left.remove(curr)
    answer[win - 1] = 0
    left.add(win - 1)
    q -= 1
print(''.join(map(str, answer)))
