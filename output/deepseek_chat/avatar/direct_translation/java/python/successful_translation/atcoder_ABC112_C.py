
MAX = 100

def main():
    import sys
    n = int(sys.stdin.readline())
    x, y, h = [], [], []
    for _ in range(n):
        xi, yi, hi = map(int, sys.stdin.readline().split())
        x.append(xi)
        y.append(yi)
        h.append(hi)
    for i in range(MAX + 1):
        for j in range(MAX + 1):
            ch = check(n, x, y, h, i, j)
            if ch > 0:
                print(i, j, ch)

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

if __name__ == "__main__":
    main()

