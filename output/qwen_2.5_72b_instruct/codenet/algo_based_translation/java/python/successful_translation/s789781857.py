
def main():
    import sys

    input = sys.stdin.read().split()
    index = 0

    n = int(input[index])
    index += 1

    c = [0] * (n - 1)
    s = [0] * (n - 1)
    f = [0] * (n - 1)

    for i in range(n - 1):
        c[i] = int(input[index])
        s[i] = int(input[index + 1])
        f[i] = int(input[index + 2])
        index += 3

    for i in range(n - 1):
        time = s[i] + c[i]
        for j in range(i + 1, n - 1):
            if time % f[j] != 0:
                time += f[j] - (time % f[j])

            if time < s[j]:
                time = s[j]

            time += c[j]

        print(time)

    print(0)

if __name__ == "__main__":
    main()

