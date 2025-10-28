
import sys

def main():
    input = sys.stdin.read().split()
    m = int(input[0])
    n = int(input[1])
    x = int(input[2])
    y = int(input[3])
    a = list(map(int, input[4:4+m]))
    b = list(map(int, input[4+m:4+m+n]))
    x_max = MaxInt(x, a)
    y_min = MinInt(y, b)
    CheckWar(x_max, y_min)

def MaxInt(x, a):
    bignum = x
    for i in range(len(a)):
        bignum = max(bignum, a[i])
    return bignum

def MinInt(y, b):
    smallnum = y
    for i in range(len(b)):
        smallnum = min(smallnum, b[i])
    return smallnum

def CheckWar(a, b):
    if a >= b:
        print("War")
    else:
        print("No War")

if __name__ == "__main__":
    main()

