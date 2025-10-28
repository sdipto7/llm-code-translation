
import sys
from math import comb

def C(n, m):
    return comb(m, n)

def main():
    n, p = map(int, sys.stdin.readline().split())
    k0 = 0
    k1 = 0
    for _ in range(n):
        x = int(sys.stdin.readline())
        if x % 2 == 1:
            k1 += 1
        else:
            k0 += 1
    ans = 1
    for _ in range(k0):
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

