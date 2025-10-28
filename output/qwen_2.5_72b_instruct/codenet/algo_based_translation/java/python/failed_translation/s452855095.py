
def main():
    import sys

    n = int(input().strip())
    arr = list(map(int, input().strip().split()))
    
    cnt = 0
    flag = True
    
    while flag:
        flag = False
        for i in range(n):
            if arr[i] % 2 != 0:
                flag = True
                break
            else:
                arr[i] = arr[i] // 2
        
        if not flag:
            cnt += 1
        else:
            break
    
    print(cnt)

if __name__ == "__main__":
    main()

