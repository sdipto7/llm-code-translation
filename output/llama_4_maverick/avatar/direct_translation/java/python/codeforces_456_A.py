
from sys import stdin

def main():
    n = int(stdin.readline().strip())
    a = []
    b = []
    f = False
    temp = 0
    q = 0
    w = float('-inf')
    e = float('inf')
    for _ in range(n):
        x, y = map(int, stdin.readline().strip().split())
        a.append(x)
        b.append(y)
        if temp <= x:
            if q > y:
                f = True
            q = y
            temp = x
        if x > w:
            w = x
            if y < e:
                f = True
            e = y
        elif x < w:
            if y > e:
                f = True
    if f:
        print("Happy Alex")
    else:
        print("Poor Alex")

if __name__ == "__main__":
    main()

