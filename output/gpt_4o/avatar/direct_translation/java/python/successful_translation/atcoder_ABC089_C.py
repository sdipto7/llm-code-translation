
import sys
from itertools import combinations

class TaskC:
    def solve(self, testNumber, in_stream, out_stream):
        n = int(in_stream.readline())
        cnt = [0] * 5
        for _ in range(n):
            str = in_stream.readline().strip()
            if str[0] == 'M':
                cnt[0] += 1
            elif str[0] == 'A':
                cnt[1] += 1
            elif str[0] == 'R':
                cnt[2] += 1
            elif str[0] == 'C':
                cnt[3] += 1
            elif str[0] == 'H':
                cnt[4] += 1
        
        res = 0
        for i, j, k in combinations(range(5), 3):
            res += cnt[i] * cnt[j] * cnt[k]
        
        out_stream.write(f"{res}\n")

if __name__ == "__main__":
    task = TaskC()
    task.solve(1, sys.stdin, sys.stdout)

