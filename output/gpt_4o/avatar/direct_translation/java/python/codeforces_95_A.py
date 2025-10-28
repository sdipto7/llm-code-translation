
import sys

class Codeforces95A:
    def __init__(self):
        self.sc = sys.stdin
        self.out = sys.stdout

    def compare(self, aa, i, bb, j, m):
        while m > 0:
            m -= 1
            a = aa[i].upper()
            b = bb[j].upper()
            if a != b:
                return ord(a) - ord(b)
            i += 1
            j += 1
        return 0

    def main(self):
        n = int(self.sc.readline().strip())
        ss = [list(self.sc.readline().strip()) for _ in range(n)]
        cc = list(self.sc.readline().strip())
        m = len(cc)
        c = self.sc.readline().strip()
        c_ = c.upper()
        a = 'b' if c == 'a' else 'a'
        a_ = a.upper()
        lucky = [False] * m
        for j in range(m):
            for i in range(n):
                l = len(ss[i])
                if m - j >= l and self.compare(cc, j, ss[i], 0, l) == 0:
                    for h in range(l):
                        lucky[j + h] = True
        for j in range(m):
            if lucky[j]:
                if cc[j].lower() == c:
                    cc[j] = a_ if cc[j].isupper() else a
                else:
                    cc[j] = c_ if cc[j].isupper() else c
        self.out.write("".join(cc) + "\n")

if __name__ == "__main__":
    Codeforces95A().main()

