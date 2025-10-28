
def main():
    import sys

    s = sys.stdin.read().strip()
    n = len(s)
    ans = 0

    for mask in range(1 << (n - 1)):
        sum = 0
        x = s[0]

        for i in range(n - 1):
            if (mask & (1 << i)) >= 1:
                x += "+" + s[i + 1]
            else:
                x += s[i + 1]

        split = x.split("+")

        for element in split:
            sum += int(element)

        ans += sum

    print(ans)

if __name__ == "__main__":
    main()

