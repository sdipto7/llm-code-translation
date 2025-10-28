
import sys
import math

class Codeforces30A:
    def main(self):
        self.solve(sys.stdin)

    def solve(self, input_stream):
        A, B, n = map(int, input_stream.readline().split())

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
            if math.pow(x, n) == B:
                print(-x if neg else x)
                return

        print("No solution")

if __name__ == "__main__":
    Codeforces30A().main()

