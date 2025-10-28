
def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()
    
    a = int(data[0])
    b = int(data[1])
    res = a
    
    while a >= b:
        res += a // b
        a = (a // b) + (a % b)
    
    print(res)

if __name__ == "__main__":
    main()

