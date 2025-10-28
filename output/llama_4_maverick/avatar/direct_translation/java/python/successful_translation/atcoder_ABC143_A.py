
try:
    x = input().split()
    a, b = int(x[0]), int(x[1])
    c = max(0, a - b * 2)
    print(c)
except Exception:
    pass

