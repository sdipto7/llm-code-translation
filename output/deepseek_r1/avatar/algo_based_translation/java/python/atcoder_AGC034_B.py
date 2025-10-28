
import sys

class BABC:
    def solve(self, s):
        s = s.replace("BC", "D")
        cnt = 0
        tmp = 0
        for c in s:
            if c == 'A':
                tmp += 1
            elif c == 'D':
                cnt += tmp
            else:
                tmp = 0
        return cnt

def main():
    s = sys.stdin.read().strip()
    solver = BABC()
    print(solver.solve(s))

if __name__ == "__main__":
    main()

