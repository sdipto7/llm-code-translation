
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []
    
    def next(self):
        while not self.st:
            try:
                self.st = self.br.read().split()
            except:
                pass
        return self.st.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_line(self):
        return sys.stdin.readline()

def main():
    sc = FastScanner()
    n = sc.next_int()
    s = sc.next_int()
    max_val = 0
    for _ in range(n):
        f = sc.next_int()
        t = sc.next_int()
        if f + t > max_val:
            max_val = f + t
    print(max(max_val, s))

if __name__ == "__main__":
    main()

