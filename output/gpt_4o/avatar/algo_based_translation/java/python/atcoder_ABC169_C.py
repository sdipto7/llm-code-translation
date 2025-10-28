
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    a = int(data[0])
    b = data[1]
    
    bStr = ''.join(ch for ch in b if ch != '.')
    bInt = int(bStr)
    
    result = (a * bInt) // 100
    print(result)

if __name__ == "__main__":
    main()

