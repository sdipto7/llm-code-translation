
def main():
    import sys
    input = sys.stdin.read
    data = input().splitlines()

    N = int(data[0])
    s = data[1]

    ans = 0
    sha = 0
    dot = 0
    first = True

    for i in range(N):
        if s[i] == '#':
            first = False
            if sha <= dot:
                ans += sha
                sha = 0
                dot = 0
                first = True
            sha += 1
        else:
            dot += 1

    if sha <= dot:
        ans += sha
        dot = 0

    print(ans + dot)

if __name__ == "__main__":
    main()

