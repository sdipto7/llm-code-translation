import sys

def main():
    import sys
    input = sys.stdin.read().split()
    w = int(input[0])
    a = int(input[1])
    b = int(input[2])

    answer = max(a, b) - min(a, b) - w
    if answer < 0:
        print(0)
    else:
        print(answer)

if __name__ == "__main__":
    main()
