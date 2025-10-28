
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline().strip().split()
        self.index = 0

    def next_int(self):
        self.index += 1
        return int(self.sc[self.index - 1])

    def next(self):
        self.index += 1
        return self.sc[self.index - 1]

    def main(self):
        n = self.next_int()
        s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
        k = [list(i) for i in s]
        for _ in range(n):
            c = list(self.next())
            l = -1
            a = 0
            for i in c:
                if i != '0':
                    a = int(i) - 1
                    l = (l + 1) % len(k[a])
                elif l >= 0:
                    print(k[a][l], end='')
                    l = -1
            print()

if __name__ == "__main__":
    main = Main()
    main.sc = sys.stdin.read().split()
    main.main()

