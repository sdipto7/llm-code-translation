
import sys

def main():
    import sys
    from collections import deque

    input = sys.stdin.read().split()
    n = int(input[0])
    a = []
    b = []
    index = 1
    for i in range(n):
        a.append(int(input[index]))
        b.append(int(input[index + 1]))
        index += 2

    temp = 0
    q = 0
    w = 0
    e = 0
    f = False

    for i in range(n):
        if temp < a[i]:
            if q > b[i]:
                f = True
            q = b[i]
            temp = a[i]
        if temp > a[i]:
            if q < b[i]:
                f = True
            q = b[i]
            temp = a[i]
        if a[i] > w:
            w = a[i]
            if b[i] < e:
                f = True
            e = b[i]
        if a[i] < w:
            if b[i] > e:
                f = True

    if f:
        print("Happy Alex")
    else:
        print("Poor Alex")

if __name__ == "__main__":
    main()

