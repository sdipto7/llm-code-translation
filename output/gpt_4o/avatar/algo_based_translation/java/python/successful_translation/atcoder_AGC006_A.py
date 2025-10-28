
import sys

N = 210
f = [0] * N
b = [''] * N

def get_fail(b, m):
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = sys.stdin.readline().strip().split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

def main():
    in_reader = InputReader(sys.stdin)
    n = in_reader.next_int()
    s1 = in_reader.next()
    str_ = in_reader.next()

    cnt = 0
    for i in range(n):
        cnt += 1
        b[cnt] = str_[i]

    for i in range(n):
        cnt += 1
        b[cnt] = s1[i]

    get_fail(b, cnt)
    len_ = min(f[cnt], n)
    print(2 * n - len_)

if __name__ == "__main__":
    main()

