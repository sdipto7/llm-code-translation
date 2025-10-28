import sys

def fun(arr, q, n, m):
    res = 0
    i = 0
    j = n
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

def main():
    import sys
    import sys
    from sys import stdin
    input = stdin.read().split()
    n = int(input[0])
    arr = [0] * n
    arr[0] = int(input[1])
    index = 2
    for i in range(1, n):
        x = int(input[index])
        arr[i] = x + arr[i - 1]
        index += 1
    m = int(input[index])
    index += 1
    q = [0] * m
    for i in range(m):
        q[i] = int(input[index])
        index += 1
    for k in range(m):
        print(fun(arr, q[k], n - 1, m) + 1)

if __name__ == "__main__":
    main()
