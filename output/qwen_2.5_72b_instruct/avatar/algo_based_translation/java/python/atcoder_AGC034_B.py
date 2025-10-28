import sys

class BABC:
    def solve(self, testNumber, in_stream, out):
        s = in_stream.readline().strip().replace("BC", "D")
        cnt = 0
        tmp = 0
        for i in range(len(s)):
            if s[i] == 'A':
                tmp += 1
            elif s[i] == 'D':
                cnt += tmp
            else:
                tmp = 0
        out.write(f"{cnt}\n")

def main():
    in_stream = sys.stdin
    out = sys.stdout
    solver = BABC()
    solver.solve(1, in_stream, out)

if __name__ == "__main__":
    main()
