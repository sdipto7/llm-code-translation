
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    a = int(data[0])
    b = int(data[1])
    c = int(data[2])
    x = int(data[3])

    res = 0

    for i in range(a + 1):
        for j in range(b + 1):
            for k in range(c + 1):
                total = 500 * i + 100 * j + 50 * k
                if total == x:
                    res += 1

    print(res)

if __name__ == "__main__":
    main()

