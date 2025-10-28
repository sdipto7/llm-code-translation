
import sys

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    arr = [0] * n
    arr[0] = int(data[1])
    index = 1
    for i in range(1, n):
        x = int(data[index])
        arr[i] = x + arr[i - 1]
        index += 1
    
    m = int(data[index])
    index += 1
    q = [0] * m
    for i in range(m):
        q[i] = int(data[index])
        index += 1
    
    for k in range(m):
        print(fun(arr, q[k], n, m) + 1)

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

if __name__ == "__main__":
    main()

