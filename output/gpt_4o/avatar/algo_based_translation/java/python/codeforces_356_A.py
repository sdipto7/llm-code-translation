
import sys
from collections import deque

class FastReader:
    def __init__(self):
        self.buffer = deque()
        self.input = sys.stdin.read().splitlines()

    def next(self):
        while not self.buffer:
            line = self.input.pop(0)
            self.buffer.extend(line.split())
        return self.buffer.popleft()

    def nextInt(self):
        return int(self.next())

def main():
    in_reader = FastReader()
    n = in_reader.nextInt()
    left = set(range(n))
    answer = [0] * n
    
    q = in_reader.nextInt()
    
    for _ in range(q):
        l = in_reader.nextInt() - 1
        r = in_reader.nextInt() - 1
        win = in_reader.nextInt()

        to_remove = []
        for i in sorted(left):
            if l <= i <= r:
                answer[i] = win
                to_remove.append(i)
        
        for i in to_remove:
            left.remove(i)

        answer[win - 1] = 0
        left.add(win - 1)

    ans = ''.join(map(str, answer))
    print(ans)

if __name__ == "__main__":
    main()

