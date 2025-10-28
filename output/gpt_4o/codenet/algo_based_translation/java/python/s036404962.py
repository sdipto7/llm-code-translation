
def main():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    X = int(data[0])
    t = int(data[1])
    
    if X >= t:
        print(X - t)
    else:
        print(0)

if __name__ == "__main__":
    main()

