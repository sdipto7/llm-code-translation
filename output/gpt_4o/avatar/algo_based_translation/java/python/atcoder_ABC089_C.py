
import sys
from itertools import combinations

class TaskC:
    def solve(self, test_number, in_stream, out_stream):
        n = int(in_stream.readline().strip())
        cnt = [0] * 5

        for _ in range(n):
            str_val = in_stream.readline().strip()
            if str_val[0] == 'M':
                cnt[0] += 1
            elif str_val[0] == 'A':
                cnt[1] += 1
            elif str_val[0] == 'R':
                cnt[2] += 1
            elif str_val[0] == 'C':
                cnt[3] += 1
            elif str_val[0] == 'H':
                cnt[4] += 1

        res = 0
        for i, j, k in combinations(range(5), 3):
            res += cnt[i] * cnt[j] * cnt[k]

        out_stream.write(str(res) + '\n')

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = TaskC()
    solver.solve(1, in_stream, out_stream)

if __name__ == "__main__":
    main()

