
import sys

class FastReader:
    def __init__(self):
        self.input = sys.stdin.read
        self.data = self.input().split()
        self.index = 0

    def next(self):
        if self.index < len(self.data):
            result = self.data[self.index]
            self.index += 1
            return result
        return None

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.next()

def solve():
    t = scan.nextInt()
    arr = [0] * t
    for i in range(t):
        arr[i] = scan.nextInt()

    prevWinner = 0

    for i in range(t):
        if arr[i] == 1:
            if prevWinner == 0:
                prevWinner = 2

        if prevWinner == 2 or prevWinner == 0:
            if (arr[i] - 1) % 2 == 0:
                print(2)
                prevWinner = 2
            else:
                print(1)
                prevWinner = 1
        else:
            if (arr[i] - 1) % 2 == 0:
                print(1)
                prevWinner = 1
            else:
                print(2)
                prevWinner = 2

if __name__ == "__main__":
    scan = FastReader()
    t = 1
    while t > 0:
        t -= 1
        solve()

