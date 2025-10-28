
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    str_list = data[1:n+1]
    
    arr = [[char for char in str_list[i]] for i in range(n)]
    
    a = arr[0][0]
    b = arr[0][1]
    
    if a == b:
        print("NO")
        return
    
    res = True
    for i in range(n):
        for j in range(n):
            if i == j or i + j == n - 1:
                if arr[i][j] != a:
                    res = False
                    break
            else:
                if arr[i][j] != b:
                    res = False
                    break
        if not res:
            break
    
    if res:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

