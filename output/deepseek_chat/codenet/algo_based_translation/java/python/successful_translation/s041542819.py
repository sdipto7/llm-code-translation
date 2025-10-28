
import sys
import math
from typing import List

class LightScanner:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def string(self):
        if self.tokenizer is None or not self.tokenizer:
            line = self.reader.readline().strip()
            if not line:
                raise EOFError("End of input")
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)
    
    def ints(self):
        return int(self.string())
    
    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, stream):
        self.out = stream
        self.autoflush = False
        self.breaked = True
    
    def print_char(self, c):
        self.out.write(c)
        self.breaked = False
        return self
    
    def print_str(self, s):
        self.out.write(s)
        self.breaked = False
        return self
    
    def ans(self, s):
        if not self.breaked:
            self.print_char(' ')
        return self.print_str(str(s))
    
    def ansln(self, *n):
        for num in n:
            self.ans(num).ln()
        return self
    
    def ln(self):
        self.print_char('\n')
        self.breaked = True
        if self.autoflush:
            self.out.flush()
        return self
    
    def close(self):
        self.out.close()

class ArrayUtil:
    @staticmethod
    def lower_bound(a: List[int], t: int, min_index: int = 0) -> int:
        max_index = len(a)
        while min_index < max_index:
            mid = (min_index + max_index) // 2
            if t <= a[mid]:
                max_index = mid
            else:
                min_index = mid + 1
        return min_index

class DLazyFaith:
    def solve(self, test_number, in_, out):
        a = in_.ints()
        b = in_.ints()
        q = in_.ints()
        
        s = [0] * (a + 2)
        t = [0] * (b + 2)
        
        s[0] = t[0] = -10000000000
        s[a + 1] = t[b + 1] = 20000000000
        
        for i in range(a):
            s[i + 1] = in_.longs()
        
        for i in range(b):
            t[i + 1] = in_.longs()
        
        for _ in range(q):
            x = in_.longs()
            
            idx_s = ArrayUtil.lower_bound(s, x + 1)
            sl = x - s[max(0, idx_s - 1)]
            
            idx_t = ArrayUtil.lower_bound(t, x + 1)
            tl = x - t[max(0, idx_t - 1)]
            
            sr = s[ArrayUtil.lower_bound(s, x)] - x
            tr = t[ArrayUtil.lower_bound(t, x)] - x
            
            min_val = min(
                max(sl, tl),
                max(sr, tr),
                2 * sl + tr,
                2 * tl + sr,
                sl + 2 * tr,
                tl + 2 * sr
            )
            out.ans(min_val).ln()

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    
    in_scanner = LightScanner(in_stream)
    out_writer = LightWriter(out_stream)
    
    solver = DLazyFaith()
    solver.solve(1, in_scanner, out_writer)
    
    out_writer.close()

if __name__ == '__main__':
    main()

