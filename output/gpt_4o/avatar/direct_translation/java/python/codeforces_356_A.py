
class FastReader:
    def __init__(self):
        import sys
        self.input = sys.stdin.read
        self.data = self.input().split()
        self.index = 0

    def next(self):
        self.index += 1
        return self.data[self.index - 1]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.next().strip()

import sys
input = sys.stdin.read

def main():
    in_reader = FastReader()
    n = in_reader.next_int()
    left = set(range(n))
    answer = [0] * n
    q = in_reader.next_int()
    for _ in range(q):
        l = in_reader.next_int() - 1
        r = in_reader.next_int() - 1
        win = in_reader.next_int()
        to_remove = set()
        for i in sorted(left):
            if i < l:
                continue
            if i > r:
                break
            if i != win - 1:
                answer[i] = win
                to_remove.add(i)
        left.difference_update(to_remove)
        left.add(win - 1)
    ans = ''.join(map(str, answer))
    print(ans)

if __name__ == "__main__":
    main()

