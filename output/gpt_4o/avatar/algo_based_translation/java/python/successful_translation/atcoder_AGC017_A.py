
from math import factorial
import sys

def C(n, m):
    res = 1
    for i in range(m - n + 1, m + 1):
        res *= i
    for i in range(1, n + 1):
        res //= i
    return res

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    p = int(data[1])
    k0 = 0
    k1 = 0

    for i in range(2, n + 2):
        x = int(data[i])
        if x % 2 == 1:
            k1 += 1
        else:
            k0 += 1

    ans = 1
    for i in range(k0):
        ans *= 2

    if p == 0:
        add = 0
        for i in range(0, k1 + 1, 2):
            add += C(i, k1)
        ans *= add
        print(ans)
    else:
        add = 0
        for i in range(1, k1 + 1, 2):
            add += C(i, k1)
        ans *= add
        print(ans)

if __name__ == "__main__":
    main()

