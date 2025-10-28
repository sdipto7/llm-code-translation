
import sys
import math

def main():
    reader = sys.stdin
    str_input = reader.readline().strip().split()
    n = int(str_input[0])
    d = float(int(str_input[1]))
    cnt = 0

    for _ in range(n):
        str_input = reader.readline().strip().split()
        x = float(int(str_input[0]))
        y = float(int(str_input[1]))
        if math.sqrt(x * x + y * y) <= d:
            cnt += 1

    print(cnt)

if __name__ == "__main__":
    main()

