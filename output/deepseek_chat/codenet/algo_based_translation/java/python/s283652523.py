
import sys
import math

MOD = 10**9 + 7

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.input = stream
        self.buffer = ""
    
    def close(self):
        pass
    
    def next_int(self):
        return int(self.next_long())
    
    def next_long(self):
        while True:
            if self.buffer:
                break
            self.buffer = sys.stdin.readline()
            if not self.buffer:
                return -1
        
        sign = 1
        pos = 0
        
        while pos < len(self.buffer) and self.buffer[pos] not in '0123456789+-':
            pos += 1
        
        if pos >= len(self.buffer):
            self.buffer = ""
            return self.next_long()
        
        if self.buffer[pos] == '-':
            sign = -1
            pos += 1
        elif self.buffer[pos] == '+':
            pos += 1
        
        ret = 0
        while pos < len(self.buffer) and '0' <= self.buffer[pos] <= '9':
            ret = ret * 10 + (ord(self.buffer[pos]) - ord('0'))
            pos += 1
        
        self.buffer = self.buffer[pos:]
        return ret * sign
    
    def next_double(self):
        while True:
            if self.buffer:
                break
            self.buffer = sys.stdin.readline()
            if not self.buffer:
                return float('nan')
        
        sign = 1.0
        pos = 0
        
        while pos < len(self.buffer) and self.buffer[pos] not in '0123456789+-.':
            pos += 1
        
        if pos >= len(self.buffer):
            self.buffer = ""
            return self.next_double()
        
        if self.buffer[pos] == '-':
            sign = -1.0
            pos += 1
        elif self.buffer[pos] == '+':
            pos += 1
        
        ret = 0.0
        while pos < len(self.buffer) and '0' <= self.buffer[pos] <= '9':
            ret = ret * 10 + (ord(self.buffer[pos]) - ord('0'))
            pos += 1
        
        if pos < len(self.buffer) and self.buffer[pos] == '.':
            pos += 1
            div = 1.0
            while pos < len(self.buffer) and '0' <= self.buffer[pos] <= '9':
                ret = ret * 10 + (ord(self.buffer[pos]) - ord('0'))
                div *= 10
                pos += 1
            ret /= div
        
        self.buffer = self.buffer[pos:]
        return sign * ret
    
    def next_char(self):
        while True:
            if self.buffer:
                break
            self.buffer = sys.stdin.readline()
            if not self.buffer:
                return '\0'
        
        pos = 0
        while pos < len(self.buffer) and self.buffer[pos].isspace():
            pos += 1
        
        if pos >= len(self.buffer):
            self.buffer = ""
            return self.next_char()
        
        ch = self.buffer[pos]
        self.buffer = self.buffer[pos + 1:]
        return ch
    
    def next_str(self):
        while True:
            if self.buffer:
                break
            self.buffer = sys.stdin.readline()
            if not self.buffer:
                return ""
        
        pos = 0
        while pos < len(self.buffer) and self.buffer[pos].isspace():
            pos += 1
        
        if pos >= len(self.buffer):
            self.buffer = ""
            return self.next_str()
        
        start = pos
        while pos < len(self.buffer) and not self.buffer[pos].isspace():
            pos += 1
        
        result = self.buffer[start:pos]
        self.buffer = self.buffer[pos:]
        return result
    
    def next_line(self):
        while True:
            if self.buffer:
                break
            self.buffer = sys.stdin.readline()
            if not self.buffer:
                return ""
        
        result = self.buffer
        self.buffer = ""
        return result.rstrip('\n')
    
    def next_int_array(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.next_int()
        return arr
    
    def next_int_array_dec(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.next_int() - 1
        return arr
    
    def next_int_array_1_index(self, n):
        arr = [0] * (n + 1)
        for i in range(n):
            arr[i + 1] = self.next_int()
        return arr
    
    def next_long_array(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.next_long()
        return arr
    
    def next_long_array_dec(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.next_long() - 1
        return arr
    
    def next_long_array_1_index(self, n):
        arr = [0] * (n + 1)
        for i in range(n):
            arr[i + 1] = self.next_long()
        return arr
    
    def next_double_array(self, n):
        arr = [0.0] * n
        for i in range(n):
            arr[i] = self.next_double()
        return arr

def solve():
    in_scanner = FastScanner()
    N = in_scanner.next_int()
    A = in_scanner.next_int_array(N)
    
    ans = 0
    sum_val = A[N - 1]
    
    for i in range(N - 2, -1, -1):
        ans = (ans + (sum_val * A[i]) % MOD) % MOD
        sum_val = (sum_val + A[i]) % MOD
    
    print(ans)

def main():
    solve()

if __name__ == "__main__":
    main()

