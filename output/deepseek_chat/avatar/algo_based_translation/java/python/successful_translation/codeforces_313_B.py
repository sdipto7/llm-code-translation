
import sys

class Fast:
    def sol(self, br, pw):
        s = br.readline().strip()
        cum = [0] * (len(s) + 1)
        cum[0] = 0
        cum[len(s)] = 0
        for i in range(1, len(s)):
            if s[i] == s[i-1]:
                cum[i] = cum[i-1] + 1
            else:
                cum[i] = cum[i-1]
        
        q = int(br.readline().strip())
        for _ in range(q):
            data = br.readline().split()
            l = int(data[0])
            r = int(data[1]) - 1
            pw.write(str(cum[r] - cum[l-1]) + '\n')

def main():
    br = sys.stdin
    pw = sys.stdout
    f = Fast()
    f.sol(br, pw)
    pw.flush()

if __name__ == '__main__':
    main()

