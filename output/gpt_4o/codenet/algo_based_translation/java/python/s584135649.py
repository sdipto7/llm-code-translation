
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    i = 0

    for i in range(1, 6):
        n = int(data[i - 1])
        if n == 0:
            break

    print(i)

if __name__ == "__main__":
    main()

