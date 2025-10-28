
import sys

N = 200 + 10
f = [0] * N
b = [0] * N

def getFail(b, m):
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
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if not line:
                raise Exception("EOF")
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class StringTokenizer:
    def __init__(self, line):
        self.tokens = line.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

in_ = InputReader(sys.stdin)
out = sys.stdout
n = in_.nextInt()
s1 = in_.next()
str_ = in_.next()
cnt = 0
for i in range(n):
    cnt += 1
    b[cnt] = str_[i]
for i in range(n):
    cnt += 1
    b[cnt] = s1[i]
getFail(b, cnt)
length = min(f[cnt], min(n, n))
out.write(str(2 * n - length) + '\n')
out.flush()

