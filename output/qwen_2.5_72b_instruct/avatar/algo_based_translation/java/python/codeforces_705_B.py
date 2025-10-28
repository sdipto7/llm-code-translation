import sys

class FastReader:
    def __init__(self):
        self.buffer = sys.stdin.buffer
        self.current_line = 0
        self.tokens = []

    def next(self):
        while not self.tokens:
            self.tokens = self.buffer.readline().decode('utf-8').split()
            if not self.tokens:
                break
        return self.tokens.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.buffer.readline().decode('utf-8')

def main():
    scan = FastReader()
    t = 1
    while t > 0:
        solve(scan)
        t -= 1

def solve(scan):
    t = scan.nextInt()
    arr = [scan.nextInt() for _ in range(t)]
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
    main()
