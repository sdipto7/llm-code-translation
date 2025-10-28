
import sys

class codeforces_67_B:
    def __init__(self):
        self.sc = sys.stdin

    def main(self):
        import sys
        import sys
        n = int(self.sc.readline().strip())
        k = int(self.sc.readline().strip())
        bb = list(map(int, self.sc.readline().strip().split()))
        aa = [0] * n
        m = 0
        for a in range(n - 1, -1, -1):
            j = 0
            while bb[a] > 0:
                if aa[j] >= a + k:
                    bb[a] -= 1
                j += 1
            for j_ in range(m, j, -1):
                aa[j_] = aa[j_ - 1]
            aa[j] = a
            m += 1
        print(" ".join(map(str, [x + 1 for x in aa])))

if __name__ == "__main__":
    o = codeforces_67_B()
    o.main()

