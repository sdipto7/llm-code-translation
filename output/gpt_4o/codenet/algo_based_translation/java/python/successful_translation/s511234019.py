
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    a = int(data[0])
    b = int(data[1])
    
    if a % 2 == 0 or b % 2 == 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

