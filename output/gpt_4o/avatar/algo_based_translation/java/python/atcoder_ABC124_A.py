
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    a = int(data[0])
    b = int(data[1])
    sum = 0
    for _ in range(2):
        if a >= b:
            sum += a
            a -= 1
        else:
            sum += b
            b -= 1
    print(sum)

if __name__ == "__main__":
    main()

