
def main():
    import sys

    input = sys.stdin.read().split()
    a = int(input[0])
    b = int(input[1])
    c = int(input[2])
    x = int(input[3])

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

