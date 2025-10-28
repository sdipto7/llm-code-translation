
import sys

class InputReader:
    def __init__(self):
        self.tokens = sys.stdin.read().split()[::-1]

    def next(self):
        return self.tokens.pop()

    def nextInt(self):
        return int(self.next())

def main():
    in_ = InputReader()
    a = in_.nextInt()
    b = in_.nextInt()
    c = in_.nextInt()
    d = in_.nextInt()
    if c > b:
        print(0)
    elif a > d:
        print(0)
    elif a < c:
        print(min(b, d) - c)
    else:
        l = sorted([a, b, c, d])
        print(l[2] - l[1])

if __name__ == "__main__":
    main()

