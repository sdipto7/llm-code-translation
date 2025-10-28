
import sys

class Scanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buffer = []
        self.index = 0
        self.length = 0
    
    def is_printable_char(self, c):
        return 33 <= c <= 126
    
    def is_digit(self, c):
        return 48 <= c <= 57
    
    def has_next_byte(self):
        if self.index < self.length:
            return True
        else:
            try:
                data = self.stream.read(1024)
                if data:
                    self.buffer = list(data.encode())
                    self.length = len(self.buffer)
                    self.index = 0
                    return True
                return False
            except:
                return False
    
    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
            self.index += 1
        return self.has_next_byte()
    
    def read_byte(self):
        if self.has_next_byte():
            byte = self.buffer[self.index]
            self.index += 1
            return byte
        return -1
    
    def next(self):
        if not self.has_next():
            raise RuntimeError("no input")
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)
    
    def next_long(self):
        if not self.has_next():
            raise RuntimeError("no input")
        value = 0
        minus = False
        b = self.read_byte()
        if b == 45:
            minus = True
            b = self.read_byte()
        while self.is_printable_char(b):
            if self.is_digit(b):
                value = value * 10 + (b - 48)
            b = self.read_byte()
        return -value if minus else value
    
    def next_int(self):
        return int(self.next_long())
    
    def next_double(self):
        return float(self.next())

def main():
    sc = Scanner()
    H = sc.next_int()
    W = sc.next_int()
    
    c = [[0]*10 for _ in range(10)]
    for i in range(10):
        for j in range(10):
            c[i][j] = sc.next_int()
    
    min_cost = [0] * 10
    for i in range(10):
        min_cost[i] = c[i][1]
    
    for tc in range(10):
        for i in range(10):
            for j in range(10):
                min_cost[i] = min(min_cost[i], c[i][j] + min_cost[j])
    
    ans = 0
    for h in range(H):
        for w in range(W):
            A = sc.next_int()
            if A >= 0:
                ans += min_cost[A]
    
    print(ans)

if __name__ == "__main__":
    main()

