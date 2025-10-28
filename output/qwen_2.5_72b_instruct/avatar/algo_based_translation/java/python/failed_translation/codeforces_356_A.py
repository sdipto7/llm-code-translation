
import sys
from collections import deque

class FastReader:
    def __init__(self):
        self.buffer = deque()
        self.input_stream = sys.stdin

    def next(self):
        if not self.buffer:
            line = self.input_stream.readline().strip()
            self.buffer.extend(line.split())
        return self.buffer.popleft()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.input_stream.readline().strip()

def main():
    in_ = FastReader()
    n = in_.nextInt()
    left = set(range(n))
    answer = [0] * n
    q = in_.nextInt()
    while q > 0:
        q -= 1
        l = in_.nextInt() - 1
        r = in_.nextInt() - 1
        win = in_.nextInt()
        curr = l
        while curr is not None and curr <= r:
            curr = min(left, key=lambda x: x if x >= l else float('inf'), default=None)
            if curr is not None and curr <= r:
                answer[curr] = win
                left.remove(curr)
        answer[win - 1] = 0
        left.add(win - 1)
    ans = ''.join(map(str, answer))
    print(ans)

if __name__ == "__main__":
    main()

