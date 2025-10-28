
class AtCoderABC114C:

    def __init__(self):
        self.scanner = None

    def main(self):
        import sys
        input = sys.stdin.read
        self.scanner = input().split()
        N = self.gi()
        i = 357
        c = 0
        while i <= N:
            s = str(i)
            if '3' in s and '5' in s and '7' in s:
                c += 1
            sb = []
            f = False
            for j in range(len(s)):
                a = s[len(s) - 1 - j]
                if f:
                    sb.append(a)
                else:
                    if a == '3':
                        sb.append('5')
                        f = True
                    elif a == '5':
                        sb.append('7')
                        f = True
                    else:
                        sb.append('3')
            if not f:
                sb.append('3')
            sb.reverse()
            i = int(''.join(sb))
        print(c)

    def gs(self):
        return self.scanner.pop(0)

    def gi(self):
        return int(self.gs())

    def gl(self):
        return int(self.gs())

    def gd(self):
        return float(self.gs())


if __name__ == "__main__":
    solver = AtCoderABC114C()
    solver.main()

