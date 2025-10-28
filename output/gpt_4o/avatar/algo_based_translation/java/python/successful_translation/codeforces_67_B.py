
import sys

class Codeforces67B:
    def __init__(self):
        self.sc = sys.stdin
        self.out = sys.stdout

    def main(self):
        input = self.sc.read().split()
        index = 0

        n = int(input[index])
        index += 1
        k = int(input[index])
        index += 1

        bb = [0] * n
        for i in range(n):
            bb[i] = int(input[index])
            index += 1

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

        for i in range(n):
            self.out.write(f"{aa[i] + 1} ")
        self.out.write("\n")

if __name__ == "__main__":
    codeforces_67_B = Codeforces67B()
    codeforces_67_B.main()

