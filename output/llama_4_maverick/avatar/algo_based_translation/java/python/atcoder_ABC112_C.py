
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
    n = int(input())
    x, y, h = [], [], []
    for _ in range(n):
        xi, yi, hi = map(int, input().split())
        x.append(xi)
        y.append(yi)
        h.append(hi)
    for cx in range(MAX + 1):
        for cy in range(MAX + 1):
            ch = check(n, x, y, h, cx, cy)
            if ch > 0:
                print(cx, cy, ch)

if __name__ == "__main__":
    main()

