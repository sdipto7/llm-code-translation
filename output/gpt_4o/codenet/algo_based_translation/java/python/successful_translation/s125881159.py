
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    d = 0
    
    for i in range(1, n + 1):
        if int(data[i]) % 2 != 0:
            d += 1
    
    if d % 2 == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

