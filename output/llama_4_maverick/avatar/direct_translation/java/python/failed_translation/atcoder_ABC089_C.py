
import sys

class TaskC:
    def solve(self, testNumber, inputStream, outputStream):
        n = int(inputStream.readline().strip())
        cnt = [0] * 5
        for _ in range(n):
            str = inputStream.readline().strip()
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
        res = cnt[0] * cnt[1] * cnt[2] + cnt[0] * cnt[1] * cnt[3] + cnt[0] * cnt[1] * cnt[4] + cnt[0] * cnt[2] * cnt[3] + cnt[0] * cnt[2] * cnt[4] + cnt[0] * cnt[3] * cnt[4] + cnt[1] * cnt[2] * cnt[3] + cnt[1] * cnt[2] * cnt[4] + cnt[1] * cnt[3] * cnt[4] + cnt[2] * cnt[3] * cnt[4]
        outputStream.write(str(res) + '\n')

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    solver = TaskC()
    solver.solve(1, inputStream, outputStream)

if __name__ == "__main__":
    main()

