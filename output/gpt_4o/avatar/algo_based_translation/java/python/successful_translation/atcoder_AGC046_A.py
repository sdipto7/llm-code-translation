
import sys

class FastReader:
    def __init__(self):
        self.input = sys.stdin.read().split()
        self.index = 0

    def next(self):
        result = self.input[self.index]
        self.index += 1
        return result

    def nextInt(self):
        return int(self.next())

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

