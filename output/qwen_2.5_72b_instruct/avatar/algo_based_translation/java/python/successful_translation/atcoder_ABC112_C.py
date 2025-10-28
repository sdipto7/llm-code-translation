
import sys

MAX = 100

def check(n, x, y, h, cx, cy):
    ch = -1
    for i in range(n):
        if h[i] > 0:
            ch = abs(x[i] - cx) + abs(y[i] - cy) + h[i]
            break
    for i in range(n):
        if h[i] != max(ch - abs(x[i] - cx) - abs(y[i] - cy), 0):
            return -1
    return ch

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    x = [0] * n
    y = [0] * n
    h = [0] * n
    index = 1
    for i in range(n):
        x[i] = int(input[index])
        y[i] = int(input[index + 1])
        h[i] = int(input[index + 2])
        index += 3
    for i in range(MAX + 1):
        for j in range(MAX + 1):
            ch = check(n, x, y, h, i, j)
            if ch > 0:
                print(i, j, ch)
                return

if __name__ == "__main__":
    main()

