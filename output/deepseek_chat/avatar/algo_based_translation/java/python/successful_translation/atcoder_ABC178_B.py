
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None
    
    def next(self):
        while self.st is None or not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except:
                pass
        return self.st.pop(0)
    
    def nextLong(self):
        return int(self.next())

def main():
    in_reader = FastReader()
    a = [0] * 4
    for i in range(4):
        a[i] = in_reader.nextLong()
    
    product1 = a[0] * a[2]
    product2 = a[1] * a[3]
    product3 = a[0] * a[3]
    product4 = a[1] * a[2]
    
    result = max(product1, product2, product3, product4)
    print(result)

if __name__ == "__main__":
    main()

