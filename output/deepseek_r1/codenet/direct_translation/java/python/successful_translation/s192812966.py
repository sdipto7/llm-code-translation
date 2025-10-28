w, h, n = map(int, input().split())
xmin, xmax = 0, w
ymin, ymax = 0, h
for _ in range(n):
    x, y, a = map(int, input().split())
    if a == 1:
        xmin = max(xmin, x)
    elif a == 2:
        xmax = min(xmax, x)
    elif a == 3:
        ymin = max(ymin, y)
    elif a == 4:
        ymax = min(ymax, y)
width = max(xmax - xmin, 0)
height = max(ymax - ymin, 0)
print(width * height)
