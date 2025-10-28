
import sys
import numpy as np

def main():
    in_stream = sys.stdin
    pw = sys.stdout

    n = int(in_stream.readline().strip())
    square = n * n
    odd = []
    even = []

    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)

    loop = square // n
    div = loop // 2
    debug(div)

    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                pw.write(f"{odd.pop(0)} {even.pop()} ")
            else:
                pw.write(f"{even.pop(0)} {odd.pop()} ")
        pw.write("\n")

def debug(*obj):
    sys.stderr.write(f"{np.array(obj)}\n")

if __name__ == "__main__":
    main()

