
import sys

class codeforces_30_A:
    def main(self):
        self.solve(sys.stdin)

    def solve(self, sc):
        A = int(sc.readline())
        B = int(sc.readline())
        n = int(sc.readline())
        if A == 0:
            if B == 0:
                print(1)
            else:
                print("No solution")
            return
        if B % A != 0:
            print("No solution")
            return
        B //= A
        neg = B < 0
        if neg and n % 2 == 0:
            print("No solution")
            return
        if neg:
            B = -B
        for x in range(B + 1):
            if x ** n == B:
                print(-x if neg else x)
                return
        print("No solution")

if __name__ == "__main__":
    codeforces_30_A().main()

