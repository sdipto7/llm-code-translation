
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    idx = 0
    w = data[idx]
    idx += 1
    h = data[idx]
    idx += 1
    n = data[idx]
    idx += 1

    x = []
    y = []
    a = []
    for _ in range(n):
        x.append(data[idx])
        idx += 1
        y.append(data[idx])
        idx += 1
        a.append(data[idx])
        idx += 1

    xmin = 0
    xmax = w
    ymin = 0
    ymax = h

    for i in range(n):
        ai = a[i]
        xi = x[i]
        yi = y[i]
        if ai == 1:
            xmin = max(xmin, xi)
        elif ai == 2:
            xmax = min(xmax, xi)
        elif ai == 3:
            ymin = max(ymin, yi)
        elif ai == 4:
            ymax = min(ymax, yi)

    width = max(xmax - xmin, 0)
    height = max(ymax - ymin, 0)
    print(width * height)

if __name__ == "__main__":
    main()

