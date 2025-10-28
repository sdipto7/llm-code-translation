
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    t = int(data[0])
    count = 0
    index = 1

    while t > 0:
        t -= 1
        a = int(data[index])
        b = int(data[index + 1])
        c = int(data[index + 2])
        index += 3

        if (a == 1 and b == 1) or (a == 1 and c == 1) or (b == 1 and c == 1) or (a == 1 and b == 1 and c == 1):
            count += 1

    print(count)

if __name__ == "__main__":
    main()

