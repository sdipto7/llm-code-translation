
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    N = int(data[0])
    idorder = {}

    for i in range(1, N + 1):
        A = int(data[i])
        idorder[A] = i

    result = []
    for i in range(1, N + 1):
        result.append(str(idorder[i]))

    print(" ".join(result))

if __name__ == "__main__":
    main()

