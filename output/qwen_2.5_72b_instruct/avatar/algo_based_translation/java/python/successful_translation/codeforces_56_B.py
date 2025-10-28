
def main():
    import sys
    import io

    input = sys.stdin.read
    data = input().split()
    
    len = int(data[0])
    a = list(map(int, data[1:len+1]))
    
    l = 0
    r = 0
    flag = False
    isTrue = False
    
    for i in range(len):
        if a[i] != i + 1 and not flag:
            l = i + 1
            flag = True
            continue
        if a[i] != i + 1 and flag:
            r = i + 1
            if (a[r - 1] - a[r - 2] > 0):
                isTrue = True
                break
    
    print(f"{l} {r}" if not isTrue else "0 0")

if __name__ == "__main__":
    main()

