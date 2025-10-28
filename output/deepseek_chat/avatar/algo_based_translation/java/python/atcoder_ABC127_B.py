
import sys
from io import BufferedReader, InputStreamReader
from java.nio import CharBuffer
from java.util import NoSuchElementException

class SimpleScanner:
    BUFFER_SIZE = 10240
    
    def __init__(self, input_stream):
        self.in_ = BufferedReader(InputStreamReader(input_stream))
        self.buffer = CharBuffer.allocate(self.BUFFER_SIZE)
        self.buffer.limit(0)
        self.eof = False
    
    def read(self):
        if not self.buffer.hasRemaining():
            self.buffer.clear()
            try:
                n = self.in_.read(self.buffer)
            except Exception:
                n = -1
            if n <= 0:
                self.eof = True
                return '\0'
            self.buffer.flip()
        return self.buffer.get()
    
    def checkEof(self):
        if self.eof:
            raise NoSuchElementException()
    
    def nextChar(self):
        self.checkEof()
        b = self.read()
        self.checkEof()
        return b
    
    def next(self):
        while True:
            b = self.read()
            self.checkEof()
            if not b.isspace():
                break
        
        sb = []
        while True:
            sb.append(b)
            b = self.read()
            if self.eof or b.isspace():
                break
        return ''.join(sb)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

def main():
    scanner = SimpleScanner(sys.stdin)
    r = scanner.nextInt()
    d = scanner.nextInt()
    x = scanner.nextLong()
    
    for i in range(10):
        x = r * x - d
        print(x)

if __name__ == '__main__':
    main()

