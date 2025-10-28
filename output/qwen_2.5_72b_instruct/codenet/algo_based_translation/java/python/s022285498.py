
import sys

class Task:

    def solve(self, testNumber, in_stream, out_stream):
        n = int(in_stream.readline())
        countArr = [0] * (n + 1)
        for x in range(1, 101):
            for y in range(1, 101):
                for z in range(1, 101):
                    value = x * x + y * y + z * z + x * y + x * z + y * z
                    if value > n:
                        break
                    countArr[value] += 1

        for i in range(1, n + 1):
            out_stream.write(f"{countArr[i]}\n")

def sort(arr):
    objArr = sorted(arr)
    for i in range(len(arr)):
        arr[i] = objArr[i]

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    task = Task()
    task.solve(1, in_stream, out_stream)

if __name__ == "__main__":
    main()

