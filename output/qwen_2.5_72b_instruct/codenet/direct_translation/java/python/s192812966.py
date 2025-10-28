
import sys

input = sys.stdin.read().split()
w, h, n = int(input[0]), int(input[1]), int(input[2])
x = [0] * n
y = [0] * n
a = [0] * n
xmax, xmin = w, 0
ymax, ymin = h, 0
index = 3
for i in range(n):
    x[i] = int(input[index])
    y[i] = int(input[index + 1])
    a[i] = int(input[index + 2])
    index += 3
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

