from sys import stdin, stdout
from io import BufferedReader, BufferedWriter

class Fast:
    def sol(self, br, pw):
        s = br.readline().strip()
        cum = [0] * (len(s) + 1)
        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                cum[i] = cum[i - 1] + 1
            else:
                cum[i] = cum[i - 1]
        q = int(br.readline())
        for _ in range(q):
            l, r = map(int, br.readline().split())
            pw.write(f"{cum[r - 1] - cum[l - 1]}\n")

def main():
    br = BufferedReader(stdin)
    pw = BufferedWriter(stdout)
    f = Fast()
    f.sol(br, pw)
    pw.flush()

if __name__ == "__main__":
    main()
