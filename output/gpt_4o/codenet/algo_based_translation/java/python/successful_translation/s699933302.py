
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    a = int(data[0])
    b = int(data[1])
    c = int(data[2])
    
    count = 0
    for i in range(a, b + 1):
        if c % i == 0:
            count += 1
    
    print(count)

if __name__ == "__main__":
    main()

