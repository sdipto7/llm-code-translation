
class Main:
    def __init__(self):
        self.sc = Scanner()

    def tr(self, *os):
        print(os)

    def run(self):
        while self.sc.hasNext():
            my1 = self.sc.nextInt()
            my2 = self.sc.nextInt()
            enemy1 = self.nextInt()
            used = [False] * 11
            used[my1] = True
            used[my2] = True
            used[enemy1] = True
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

class Scanner:
    def __init__(self):
        self.input = iter(input().split())

    def hasNext(self):
        return True

    def nextInt(self):
        return int(next(self.input))

    def nextInt(self):
        return int(next(self.input))

    def nextInt(self):
        return int(next(self.input))

Main().run()

