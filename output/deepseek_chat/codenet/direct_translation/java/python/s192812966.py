
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    idx = 0
    w = int(data[idx])
    idx += 1
    h = int(data[idx])
    idx += 1
    n = int(data[idx])
    idx += 1
    x = []
    y = []
    a = []
    for _ in range(n):
        x.append(int(data[idx]))
        idx += 1
        y.append(int(data[idx]))
        idx += 1
        a.append(int(data[idx]))
        idx += 1
    xmax = w
    xmin = 0
    ymax = h
    ymin = 0
    for i in range(n):
        if a[i] == 1:
            xmin = max(xmin, x[i])
        elif a[i] == 2:
            xmax = min(xmax, x[i])
        elif a[i] == 3:
            ymin = max(ymin, y[i])
        elif a[i] == 4:
            ymax = min(ymax, y[i])
    w = max(xmax - xmin, 0)
    h = max(ymax - ymin, 0)
    print(w * h)

if __name__ == "__main__":
    main()

