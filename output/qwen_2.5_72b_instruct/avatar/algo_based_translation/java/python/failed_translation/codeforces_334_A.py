
import sys
from collections import deque

def main():
    import sys
    import sys
    in_ = sys.stdin.read().split()
    pw = sys.stdout
    n = int(in_[0])
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
    print(div, file=sys.stderr)
    odd = deque(odd)
    even = deque(even)
    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                pw.write(f"{odd.popleft()} {even.pop()} ")
            else:
                pw.write(f"{even.popleft()} {odd.pop()} ")
        pw.write("\n")

if __name__ == "__main__":
    main()

