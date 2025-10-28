
import sys

def main():
    import sys
    n = 0
    a = 0
    b = 0
    c = 0
    input = sys.stdin.read().split()
    index = 0

    n = int(input[index])
    index += 1

    for i in range(n):
        a += int(input[index])
        index += 1

    for i in range(n - 1):
        b += int(input[index])
        index += 1

    for i in range(n - 2):
        c += int(input[index])
        index += 1

    x = a - b
    y = b - c

    print(x)
    print(y)

if __name__ == "__main__":
    main()

