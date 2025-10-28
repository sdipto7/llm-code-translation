import sys

class TaskC:
    def solve(self, testNumber, in_stream, out_stream):
        n = int(in_stream.readline().strip())
        cnt = [0] * 5
        for _ in range(n):
            str_input = in_stream.readline().strip()
            if str_input[0] == 'M':
                cnt[0] += 1
            elif str_input[0] == 'A':
                cnt[1] += 1
            elif str_input[0] == 'R':
                cnt[2] += 1
            elif str_input[0] == 'C':
                cnt[3] += 1
            elif str_input[0] == 'H':
                cnt[4] += 1
        res = (cnt[0] * cnt[1] * cnt[2] +
               cnt[0] * cnt[1] * cnt[3] +
               cnt[0] * cnt[1] * cnt[4] +
               cnt[0] * cnt[2] * cnt[3] +
               cnt[0] * cnt[2] * cnt[4] +
               cnt[0] * cnt[3] * cnt[4] +
               cnt[1] * cnt[2] * cnt[3] +
               cnt[1] * cnt[2] * cnt[4] +
               cnt[1] * cnt[3] * cnt[4] +
               cnt[2] * cnt[3] * cnt[4])
        out_stream.write(f'{res}\n')

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = TaskC()
    solver.solve(1, in_stream, out_stream)

if __name__ == '__main__':
    main()
