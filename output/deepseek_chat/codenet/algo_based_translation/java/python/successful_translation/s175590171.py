
import sys
import array

class FastScanner:
    def __init__(self):
        self.in_stream = sys.stdin.buffer
        self.buffer = array.array('b')
        self.ptr = 0
        self.buflen = 0
    
    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buffer = array.array('b', self.in_stream.read(1024))
                self.buflen = len(self.buffer)
            except:
                self.buflen = 0
            return self.buflen > 0
    
    def read_byte(self):
        if self.has_next_byte():
            val = self.buffer[self.ptr]
            self.ptr += 1
            return val
        else:
            return -1
    
    @staticmethod
    def is_printable_char(c):
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
                n = n * 10 + (b - ord('0'))
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

def main():
    fs = FastScanner()
    n = fs.next_int()
    a = [0] * n
    for i in range(n):
        a[i] = fs.next_int()
    a.sort()
    total_sum = 0
    count = 0
    for i in range(n - 1):
        total_sum += a[i]
        if a[i + 1] <= 2 * total_sum:
            count += 1
        else:
            count = 0
    print(count + 1)

if __name__ == "__main__":
    main()

