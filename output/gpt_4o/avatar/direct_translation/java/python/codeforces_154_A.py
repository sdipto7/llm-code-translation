
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    arr = list(data[0])
    N = len(arr)
    K = int(data[1])
    res = 0
    index = 2
    
    for _ in range(K):
        pair = data[index]
        index += 1
        a = 0
        b = 0
        for i in range(N):
            if arr[i] == pair[0]:
                a += 1
            elif arr[i] == pair[1]:
                b += 1
            else:
                res += min(a, b)
                a = b = 0
        res += min(a, b)
    
    print(res)

main()

