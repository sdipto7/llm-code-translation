
import sys

class Main:
    def __init__(self):
        self.in_file = sys.stdin
        self.out_file = sys.stdout

    def read_int(self):
        return int(self.in_file.readline().strip())

    def read_ints(self):
        return map(int, self.in_file.readline().strip().split())

    def main(self):
        n, m = self.read_ints()
        A = [list(self.read_ints()) for _ in range(n)]
        b = list(self.read_ints())
        for i in range(n):
            c = sum(A[i][j] * b[j] for j in range(m))
            self.out_file.write(str(c) + '\n')

if __name__ == "__main__":
    main = Main()
    main.main()
    main.out_file.flush()

