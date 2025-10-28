
import sys

class Scanner:
    def __init__(self):
        self.buffer = []
        self.eof = False
    
    def _read(self):
        if not self.buffer:
            data = sys.stdin.read().split()
            if not data:
                self.eof = True
                return
            self.buffer.extend(data)
        return self.buffer.pop(0)
    
    def _check_eof(self):
        if self.eof:
            raise EOFError()
    
    def next(self):
        self._check_eof()
        token = None
        while not token:
            token = self._read()
            self._check_eof()
        return token
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())

def main():
    scanner = Scanner()
    r = scanner.next_int()
    d = scanner.next_int()
    x = scanner.next_long()
    for _ in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    main()

