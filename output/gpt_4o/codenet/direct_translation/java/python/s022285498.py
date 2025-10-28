
import sys
from itertools import product

class Task:

    def solve(self, testNumber, in_file, out_file):
        n = int(in_file.readline().strip())
        countArr = [0] * (n + 1)
        for x, y, z in product(range(1, 101), repeat=3):
            value = x * x + y * y + z * z + x * y + x * z + y * z
            if value > n:
                continue
            countArr[value] += 1

        for i in range(1, n + 1):
            out_file.write(f"{countArr[i]}\n")


def solve():
    in_file = sys.stdin
    out_file = sys.stdout
    task = Task()
    task.solve(1, in_file, out_file)

if __name__ == "__main__":
    solve()

