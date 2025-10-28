
import sys

class InputIterator:
    def __init__(self):
        self.inputLine = sys.stdin.read().splitlines()
        self.index = 0
        self.max = len(self.inputLine)

    def hasNext(self):
        return self.index < self.max

    def next(self):
        if self.hasNext():
            self.index += 1
            return self.inputLine[self.index - 1]
        else:
            raise IndexError("There is no more input")

ii = InputIterator()
CONVSTR = {8: " ", 9: "\n", 0: ""}

def next():
    return ii.next()

def nextInt():
    return int(next())

def nextStrArray():
    return next().split()

def nextIntArray():
    return [int(x) for x in nextStrArray()]

def myout(t):
    print(t)

def solve():
    N = nextInt()
    list = nextIntArray()
    max_val = 0
    output = 0
    for i in range(N):
        if max_val <= list[i]:
            max_val = list[i]
            output += 1
    myout(output)

if __name__ == "__main__":
    solve()

