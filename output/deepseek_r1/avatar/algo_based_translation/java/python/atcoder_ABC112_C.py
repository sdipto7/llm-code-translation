
import sys

def check(n, x, y, h, cx, cy):
    ch = -1
    for i in range(n):
        if h[i] > 0:
            ch = abs(x[i] - cx) + abs(y[i] - cy) + h[i]
            break
    for i in range(n):
        expected = max(ch - abs(x[i] - cx) - abs(y[i] - cy), 0)
        if h[i] != expected:
            return -1
    return ch

def main():
    n = int(sys.stdin.readline())
    x, y, h = [], [], []
    for _ in range(n):
        a, b, c = map(int, sys.stdin.readline().split())
        x.append(a)
        y.append(b)
        h.append(c)
    MAX = 100
    for cx in range(MAX + 1):
        for cy in range(MAX + 1):
            current_h = check(n, x, y, h, cx, cy)
            if current_h > 0:
                print(cx, cy, current_h)
                return

if __name__ == "__main__":
    main()

