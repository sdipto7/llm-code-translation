
import sys
import io
import os

class FastIO(io.IOBase):
    newlines = 0

    def __init__(self, file):
        self._fd = file.fileno()
        self.buffer = io.BytesIO()
        self.writable = 'x' in file.mode or 'r' not in file.mode
        self.write = self.buffer.write if self.writable else None

    def read(self):
        while True:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, 8192))
            if not b:
                break
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines = 0
        return self.buffer.read()

    def readline(self):
        while self.newlines == 0:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, 8192))
            self.newlines = b.count(b'\n') + (not b)
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines -= 1
        return self.buffer.readline()

    def flush(self):
        if self.writable:
            os.write(self._fd, self.buffer.getvalue())
            self.buffer.truncate(0), self.buffer.seek(0)

class IOWrapper(io.IOBase):

    def __init__(self, file):
        self.buffer = FastIO(file)
        self.flush = self.buffer.flush
        self.writable = self.buffer.writable
        self.write = lambda s: self.buffer.write(s.encode('ascii'))
        self.read = lambda: self.buffer.read().decode('ascii')
        self.readline = lambda: self.buffer.readline().decode('ascii')

sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)
input = lambda: sys.stdin.readline().rstrip('\r\n')

def ns():
    return sys.stdin.readline().rstrip('\r\n')

def ni():
    return int(sys.stdin.readline().rstrip('\r\n'))

def na(n):
    return [int(x) for x in sys.stdin.readline().rstrip('\r\n').split()]

def nla(n):
    return [int(x) for x in sys.stdin.readline().rstrip('\r\n').split()]

def solve():
    s = list(ns())
    n = len(s)
    ans = cnt = 0
    for i in range(n):
        if s[i] == 'S':
            cnt += 1
        else:
            if cnt == 0:
                continue
            ans += 1
            cnt -= 1
    print(n - 2 * ans)

def main():
    solve()

if __name__ == "__main__":
    main()

