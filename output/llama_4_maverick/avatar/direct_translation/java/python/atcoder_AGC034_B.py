
import sys

class BABC:
    def solve(self, testNumber, inStream, outStream):
        s = inStream.readline().strip().replace('BC', 'D')
        cnt = 0
        tmp = 0
        for c in s:
            if c == 'A':
                tmp += 1
            elif c == 'D':
                cnt += tmp
            else:
                tmp = 0
        outStream.write(str(cnt) + '\n')

def main():
    inStream = sys.stdin
    outStream = sys.stdout
    solver = BABC()
    solver.solve(1, inStream, outStream)

if __name__ == "__main__":
    main()

