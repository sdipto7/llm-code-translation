
import sys

def main():
    n = int(input().strip())
    str_arr = []
    for i in range(n):
        str_arr.append(input().strip())
    
    arr = []
    for i in range(n):
        row = []
        for j in range(n):
            row.append(str_arr[i][j])
        arr.append(row)
    
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

