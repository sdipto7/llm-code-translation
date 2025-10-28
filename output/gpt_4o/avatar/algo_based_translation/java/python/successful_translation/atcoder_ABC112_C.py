
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
    input = sys.stdin.read
    data = input().split()
    index = 0
    n = int(data[index])
    index += 1
    x = [0] * n
    y = [0] * n
    h = [0] * n
    
    for i in range(n):
        x[i] = int(data[index])
        index += 1
        y[i] = int(data[index])
        index += 1
        h[i] = int(data[index])
        index += 1

    for i in range(MAX + 1):
        for j in range(MAX + 1):
            ch = check(n, x, y, h, i, j)
            if ch > 0:
                print(i, j, ch)
                return

if __name__ == '__main__':
    main()

