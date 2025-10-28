
class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(self.reader.readline().split())
            except Exception as e:
                raise RuntimeError(e)
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

def getFail(b, m):
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j

import sys
input = sys.stdin
output = sys.stdout

N = 200 + 10
f = [0] * N
b = [''] * N

in_reader = InputReader(input)
n = in_reader.nextInt()
s1 = in_reader.next()
str_ = in_reader.next()

cnt = 0
for i in range(n):
    cnt += 1
    b[cnt] = str_[i]
for i in range(n):
    cnt += 1
    b[cnt] = s1[i]

getFail(b, cnt)
length = min(f[cnt], min(n, n))
output.write(f"{2 * n - length}\n")
output.flush()

