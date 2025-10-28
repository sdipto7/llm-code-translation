import sys
import math

class Task:
    def solve(self, testNumber, inp, out):
        n = int(inp())
        countArr = [0] * (n + 1)
        for x in range(1, 101):
            for y in range(1, 101):
                for z in range(1, 101):
                    value = x * x + y * y + z * z + x * y + x * z + y * z
                    if value > n:
                        break
                    countArr[value] += 1
        for i in range(1, n + 1):
            out.write(f"{countArr[i]}\n")

def solve():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = input_stream.readline
    out = output_stream.write
    task = Task()
    task.solve(1, inp, out)

if __name__ == "__main__":
    solve()
