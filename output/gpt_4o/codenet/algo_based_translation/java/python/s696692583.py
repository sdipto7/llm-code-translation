
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin

    def tr(self, *os):
        print(os, file=sys.stderr)

    def run(self):
        for line in self.sc:
            my1, my2, enemy1 = map(int, line.split())
            used = [False] * 11
            used[my1] = used[my2] = used[enemy1] = True
            all = 0
            safe = 0
            for i in range(1, 11):
                if not used[i]:
                    all += 1
                    if my1 + my2 + i <= 20:
                        safe += 1
            if safe * 2 >= all:
                print("YES")
            else:
                print("NO")

    def solve(self, a):
        s = ['d', 'o', 'x']
        for side in range(1, 3):
            for i in range(3):
                if a[i][0] == side and a[i][1] == side and a[i][2] == side:
                    return s[side]
                if a[0][i] == side and a[1][i] == side and a[2][i] == side:
                    return s[side]
            if a[0][0] == side and a[1][1] == side and a[2][2] == side:
                return s[side]
            if a[0][2] == side and a[1][1] == side and a[2][0] == side:
                return s[side]
        return 'd'

if __name__ == '__main__':
    Main().run()

