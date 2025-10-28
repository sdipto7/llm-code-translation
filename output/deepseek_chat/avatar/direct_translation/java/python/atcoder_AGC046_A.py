
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            try:
                return input()
            except EOFError:
                pass

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.next()

def main():
    sc = FastReader()
    x = sc.nextInt()
    count = 0
    tmp = x
    x = 0
    while x != 360:
        x += tmp
        if x > 360:
            x -= 360
        count += 1
    print(count)

if __name__ == "__main__":
    main()

