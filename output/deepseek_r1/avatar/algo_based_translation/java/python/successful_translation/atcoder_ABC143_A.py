
try:
    x = input().strip().split()
    a = int(x[0])
    b = int(x[1])
    c = a - 2 * b
    if c < 0:
        c = 0
    print(c)
except:
    pass

