
import sys
import array

class FastScanner:
    def __init__(self):
        self.in_stream = sys.stdin.buffer
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in_stream.readinto(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return bytes(sb).decode()

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or ord('9') < b:
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2**31 or nl > 2**31 - 1:
            raise ValueError
        return int(nl)

    def nextDouble(self):
        return float(self.next())


def main():
    fs = FastScanner()
    n = fs.nextInt()
    a = array.array('i', (fs.nextInt() for _ in range(n)))
    a = sorted(a)
    
    sum = 0
    count = 0
    for i in range(n - 1):
        sum += a[i]
        if a[i + 1] <= 2 * sum:
            count += 1
        else:
            count = 0
    print(count + 1)


if __name__ == "__main__":
    main()

