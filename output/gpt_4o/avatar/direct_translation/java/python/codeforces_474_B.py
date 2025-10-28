
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

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    n = int(data[index])
    index += 1
    arr = [0] * n
    arr[0] = int(data[index])
    index += 1
    
    for i in range(1, n):
        x = int(data[index])
        index += 1
        arr[i] = x + arr[i - 1]
    
    m = int(data[index])
    index += 1
    q = [0] * m
    for i in range(m):
        q[i] = int(data[index])
        index += 1
    
    for k in range(m):
        print(fun(arr, q[k], n, m) + 1)

if __name__ == "__main__":
    main()

