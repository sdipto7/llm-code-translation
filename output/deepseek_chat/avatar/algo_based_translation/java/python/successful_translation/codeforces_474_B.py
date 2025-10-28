
import sys

def main():
    data = sys.stdin.read().split()
    idx = 0
    n = int(data[idx]); idx += 1
    arr = [0] * n
    arr[0] = int(data[idx]); idx += 1
    for i in range(1, n):
        x = int(data[idx]); idx += 1
        arr[i] = x + arr[i-1]
    m = int(data[idx]); idx += 1
    q = [0] * m
    for i in range(m):
        q[i] = int(data[idx]); idx += 1
    for k in range(m):
        result = fun(arr, q[k], n, m) + 1
        print(result)

def fun(arr, q_val, n, m):
    res = 0
    i = 0
    j = n - 1
    while i <= j:
        md = i + (j - i) // 2
        if arr[md] == q_val:
            return md
        elif arr[md] > q_val:
            res = md
            j = md - 1
        else:
            i = md + 1
    return res

if __name__ == "__main__":
    main()

