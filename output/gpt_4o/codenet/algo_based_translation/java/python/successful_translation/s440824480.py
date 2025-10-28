
def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()
    
    n = int(data[0])
    c = 0
    flg = 0
    
    index = 1
    while n > 0:
        x = int(data[index])
        y = int(data[index + 1])
        index += 2
        n -= 1
        
        if x == y:
            c += 1
            if c >= 3:
                flg = 1
        else:
            c = 0
    
    if flg == 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

