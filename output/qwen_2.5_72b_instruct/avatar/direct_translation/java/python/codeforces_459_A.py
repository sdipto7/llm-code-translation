
import sys

def main():
    import sys
    import math
    input = sys.stdin.read().split()
    x1, y1, x2, y2 = int(input[0]), int(input[1]), int(input[2]), int(input[3])
    if x1 == x2:
        dif = abs(y1 - y2)
        print(x1 + dif, y1, x1 + dif, y2)
    elif y1 == y2:
        dif = abs(x1 - x2)
        print(x1, y1 + dif, x2, y2 + dif)
    elif abs(x1 - x2) == abs(y1 - y2):
        print(x1, y2, x2, y1)
    else:
        print(-1)

if __name__ == "__main__":
    main()

