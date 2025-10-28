
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while not hasattr(self, 'st') or not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                pass
        return self.st.pop(0)

    def nextLong(self):
        return int(self.next())

def main():
    in_ = FastReader()
    a = [in_.nextLong() for _ in range(4)]
    print(max(a[0] * a[2], a[1] * a[3], a[0] * a[3], a[1] * a[2]))

if __name__ == "__main__":
    main()

