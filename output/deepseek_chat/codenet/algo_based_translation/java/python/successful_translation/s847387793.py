
import sys
import array

class FastScanner:
    def __init__(self):
        self.buffer = array.array('b')
        self.ptr = 0
        self.buflen = 0
    
    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                data = sys.stdin.buffer.read()
                self.buffer.frombytes(data)
                self.buflen = len(self.buffer)
            except:
                self.buflen = 0
            return self.buflen > 0
    
    def read_byte(self):
        if self.has_next_byte():
            byte_val = self.buffer[self.ptr]
            self.ptr += 1
            return byte_val
        else:
            return -1
    
    def is_printable_char(self, c):
        return 33 <= c <= 126
    
    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()
    
    def next(self):
        if not self.has_next():
            raise Exception("NoSuchElementException")
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)
    
    def next_long(self):
        if not self.has_next():
            raise Exception("NoSuchElementException")
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or b > ord('9'):
            raise Exception("NumberFormatException")
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise Exception("NumberFormatException")
            b = self.read_byte()
    
    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise Exception("NumberFormatException")
        return int(nl)
    
    def next_double(self):
        return float(self.next())
    
    def next_int_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_int()
        return a
    
    def next_long_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_long()
        return a

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer
        self.n = 0
        self.m = 0
        self.q = 0
        self.max_val = 0
        self.a = []
        self.b = []
        self.c = []
        self.d = []
    
    def run(self):
        self.n = self.sc.next_int()
        self.m = self.sc.next_int()
        self.q = self.sc.next_int()
        self.a = [0] * self.q
        self.b = [0] * self.q
        self.c = [0] * self.q
        self.d = [0] * self.q
        for i in range(self.q):
            self.a[i] = self.sc.next_int()
            self.b[i] = self.sc.next_int()
            self.c[i] = self.sc.next_int()
            self.d[i] = self.sc.next_int()
        self.dfs([1])
        self.writer.write(str(self.max_val) + '\n')
    
    def dfs(self, arr):
        if len(arr) > self.n:
            score = 0
            for i in range(self.q):
                if arr[self.b[i]] - arr[self.a[i]] == self.c[i]:
                    score += self.d[i]
            self.max_val = max(self.max_val, score)
            return
        
        new_arr = arr + [arr[-1]]
        while new_arr[-1] <= self.m:
            self.dfs(new_arr)
            new_arr[-1] += 1

def main():
    sc = FastScanner()
    writer = sys.stdout
    solver = Solver(sc, writer)
    solver.run()
    writer.flush()

if __name__ == '__main__':
    main()

