
import sys

class Main:
    def __init__(self):
        self.scanner = sys.stdin.readline

    def main(self):
        h, w = map(int, self.scanner().split())
        ans = []
        for _ in range(h):
            s = self.scanner().strip()
            ans.append("#" + s + "#")
        border = "#" * (w + 2)
        print(border)
        for s in ans:
            print(s)
        print(border)

if __name__ == "__main__":
    main = Main()
    main.main()

