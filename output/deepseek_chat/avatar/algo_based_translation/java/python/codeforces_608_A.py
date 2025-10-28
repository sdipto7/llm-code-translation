
import sys
import io

class FastScanner:
    def __init__(self):
        self.br = io.BufferedReader(io.InputStreamReader(sys.stdin))
        self.st = []
    
    def next(self):
        while not self.st:
            try:
                line = self.br.readline()
                self.st = line.split()
            except Exception:
                pass
        return self.st.pop(0)
    
    def next_line(self):
        try:
            return self.br.readline()
        except Exception:
            return ""
    
    def next_byte(self):
        return int(self.next())
    
    def next_short(self):
        return int(self.next())
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())

def main():
    sc = FastScanner()
    n = int(input())
    s = int(input())
    max_val = 0
    
    while n > 0:
        n -= 1
        f = int(input())
        t = int(input())
        if max_val < f + t:
            max_val = f + t
    
    print(max(max_val, s))

if __name__ == "__main__":
    main()

