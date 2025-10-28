
import sys

class codeforces_95_A:
    def __init__(self):
        self.out = sys.stdout

    def main(self):
        import sys
        input = sys.stdin.read().split()
        n = int(input[0])
        ss = [list(input[i]) for i in range(1, n + 1)]
        cc = list(input[n + 1])
        m = len(cc)
        c = input[n + 2][0]
        c_ = c.upper()
        a = 'b' if c == 'a' else 'a'
        a_ = a.upper()
        lucky = [False] * m
        index = n + 3
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
        self.out.write(''.join(cc) + '\n')

    def compare(self, aa, i, bb, j, m):
        while m > 0:
            a = aa[i].upper()
            b = bb[j].upper()
            if a != b:
                return ord(a) - ord(b)
            i += 1
            j += 1
            m -= 1
        return 0

if __name__ == "__main__":
    o = codeforces_95_A()
    o.main()

