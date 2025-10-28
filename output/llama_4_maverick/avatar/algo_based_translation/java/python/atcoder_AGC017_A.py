
import math

def C(n, m):
    res = 1
    for i in range(m - n + 1, m + 1):
        res *= i
    for i in range(1, n + 1):
        res //= i
    return res

def main():
    n, p = map(int, input().split())
    k0, k1 = 0, 0
    for x in map(int, input().split()):
        if x % 2 == 1:
            k1 += 1
        else:
            k0 += 1
    ans = 1
    for _ in range(k0):
        ans *= 2
    if p == 0:
        add = sum(C(i, k1) for i in range(0, k1 + 1, 2))
        ans *= add
    else:
        add = sum(C(i, k1) for i in range(1, k1 + 1, 2))
        ans *= add
    print(ans)

if __name__ == "__main__":
    main()

