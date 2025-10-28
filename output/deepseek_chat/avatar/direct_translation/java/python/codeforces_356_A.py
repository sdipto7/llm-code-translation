
import sys
import bisect

class FastReader:
    def __init__(self):
        self.input = sys.stdin.read().split()
        self.idx = 0

    def next(self):
        self.idx += 1
        return self.input[self.idx - 1]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.next()

def main():
    in_ = FastReader()
    n = in_.nextInt()
    left = set(range(n))
    answer = [0] * n
    q = in_.nextInt()
    for _ in range(q):
        l = in_.nextInt() - 1
        r = in_.nextInt() - 1
        win = in_.nextInt()
        to_remove = []
        for i in range(l, r + 1):
            if i in left:
                answer[i] = win
                to_remove.append(i)
        for i in to_remove:
            left.remove(i)
        answer[win - 1] = 0
        left.add(win - 1)
    print(''.join(map(str, answer)))

if __name__ == "__main__":
    main()

