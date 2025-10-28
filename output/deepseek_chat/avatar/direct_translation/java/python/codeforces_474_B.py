
import sys

def main():
    sc = sys.stdin
    n = int(sc.readline())
    arr = [0] * n
    arr[0] = int(sc.readline())
    for i in range(1, n):
        x = int(sc.readline())
        arr[i] = x + arr[i - 1]
    m = int(sc.readline())
    q = [0] * m
    for i in range(m):
        q[i] = int(sc.readline())
    for k in range(m):
        print(fun(arr, q[k], n, m) + 1)

def fun(arr, q, n, m):
    res = 0
    i, j = 0, n
    while i <= j:
        md = i + (j - i) // 2
        if arr[md] == q:
            return md
        elif arr[md] > q:
            res = md
            j = md - 1
        else:
            i = md + 1
    return res

if __name__ == "__main__":
    main()

