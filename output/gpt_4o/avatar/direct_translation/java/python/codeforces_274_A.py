
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    k = int(data[1])
    arr = list(map(int, data[2:n+2]))
    
    arr.sort()
    count = 0
    set_ = set()
    
    for i in range(n):
        if arr[i] % k != 0:
            count += 1
            set_.add(arr[i])
        elif (arr[i] // k) not in set_:
            count += 1
            set_.add(arr[i])
    
    print(count)

if __name__ == "__main__":
    main()

