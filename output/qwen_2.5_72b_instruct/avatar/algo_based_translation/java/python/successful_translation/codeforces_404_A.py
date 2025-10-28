import sys

def main():
    import sys
    import sys
    n = int(sys.stdin.readline())
    arr = [['' for _ in range(n)] for _ in range(n)]
    str_input = [sys.stdin.readline().strip() for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            arr[i][j] = str_input[i][j]
    
    a = arr[0][0]
    b = arr[0][1]
    
    if a == b:
        print("NO")
    else:
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
