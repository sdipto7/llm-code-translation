import sys

def main():
    import sys
    import sys

    in_input = sys.stdin.read().split()
    x = int(in_input[0])
    y = int(in_input[1])
    a = int(in_input[2])
    b = int(in_input[3])
    count = 0

    for i in range(a, x + 1):
        for j in range(b, y + 1):
            if i <= j:
                continue
            count += 1

    print(count)

    for i in range(a, x + 1):
        for j in range(b, y + 1):
            if i <= j:
                continue
            print(i, j)

if __name__ == "__main__":
    main()
