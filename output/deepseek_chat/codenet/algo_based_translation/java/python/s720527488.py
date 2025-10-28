
import sys
import random
import array
import math
from collections import deque, defaultdict
import heapq
import bisect

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.curbuf = 0
        self.lenbuf = 0
    
    def read_byte(self):
        if self.lenbuf == -1:
            raise EOFError()
        if self.curbuf >= self.lenbuf:
            self.curbuf = 0
            try:
                self.lenbuf = self.stream.readinto(self.buffer)
            except:
                raise EOFError()
            if self.lenbuf <= 0:
                return -1
        return self.buffer[self.curbuf]
    
    def is_space_char(self, c):
        return not (33 <= c <= 126)
    
    def skip(self):
        b = self.read_byte()
        while b != -1 and self.is_space_char(b):
            b = self.read_byte()
        return b
    
    def next(self):
        b = self.skip()
        sb = []
        while b != -1 and not self.is_space_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)
    
    def next_int(self):
        c = self.read_byte()
        while self.is_space_char(c):
            c = self.read_byte()
        minus = False
        if c == 45:
            minus = True
            c = self.read_byte()
        res = 0
        while not self.is_space_char(c):
            if c < 48 or c > 57:
                raise ValueError()
            res = res * 10 + c - 48
            c = self.read_byte()
        return -res if minus else res
    
    def next_long(self):
        c = self.read_byte()
        while self.is_space_char(c):
            c = self.read_byte()
        minus = False
        if c == 45:
            minus = True
            c = self.read_byte()
        res = 0
        while not self.is_space_char(c):
            if c < 48 or c > 57:
                raise ValueError()
            res = res * 10 + c - 48
            c = self.read_byte()
        return -res if minus else res
    
    def to_int_array(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.next_int()
        return arr

def sort_array(a):
    n = len(a)
    for i in range(n-1, 0, -1):
        t = random.randint(0, i)
        a[i], a[t] = a[t], a[i]
    a.sort()

def main():
    INF = sys.maxsize // 2
    LINF = (1 << 63) - 1
    
    ir = InputReader(sys.stdin.buffer)
    m = ir.next_int()
    n = ir.next_int()
    manju = ir.to_int_array(m)
    
    boxlen = [0] * n
    boxcost = [0] * n
    for i in range(n):
        boxlen[i] = ir.next_int()
        boxcost[i] = ir.next_int()
    
    sort_array(manju)
    
    dp = [[0] * (n+1) for _ in range(m+1)]
    
    for i in range(m-1, -1, -1):
        for j in range(n-1, -1, -1):
            length = min(i + boxlen[j], m)
            cnt = 0
            for k in range(i, length):
                cnt += manju[m-1-k]
            dp[i][j] = max(dp[length][j+1] + cnt - boxcost[j], dp[i][j+1])
    
    print(dp[0][0])
    sys.stdout.flush()

if __name__ == '__main__':
    main()

