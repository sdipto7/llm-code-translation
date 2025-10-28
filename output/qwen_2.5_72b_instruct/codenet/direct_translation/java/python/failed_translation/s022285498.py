
import sys
import threading

class Task:
    def solve(self, testNumber, in_, out):
        n = int(in_.readline())
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
    in_ = sys.stdin
    out = sys.stdout
    task = Task()
    task.solve(1, in_, out)

threading.Thread(target=solve, stack_size=1 << 26).start()

