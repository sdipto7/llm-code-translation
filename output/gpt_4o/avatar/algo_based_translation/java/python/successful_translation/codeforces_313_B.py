
import sys

class Fast:
    def sol(self, br, pw):
        s = br.readline().strip()
        cum = [0] * (len(s) + 1)
        
        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                cum[i] = cum[i - 1] + 1
            else:
                cum[i] = cum[i - 1]
        
        q = int(br.readline().strip())
        for _ in range(q):
            l, r = map(int, br.readline().strip().split())
            r -= 1
            pw.write(f"{cum[r] - cum[l - 1]}\n")

def main():
    br = sys.stdin
    pw = sys.stdout
    f = Fast()
    f.sol(br, pw)

if __name__ == "__main__":
    main()

