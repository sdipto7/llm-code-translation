
def main():
    import sys
    import io

    # Simulating input for testing purposes
    # sys.stdin = io.StringIO("5 3\n")

    a = int(input().strip())
    b = int(input().strip())
    sum = 0

    for i in range(2):
        if a >= b:
            sum += a
            a -= 1
        else:
            sum += b
            b -= 1

    print(sum)

if __name__ == "__main__":
    main()

