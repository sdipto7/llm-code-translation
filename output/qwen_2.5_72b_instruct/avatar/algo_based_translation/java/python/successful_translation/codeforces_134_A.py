
import sys

def main():
    import sys
    from io import StringIO
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys

    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys

    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys

    from sys import stdin

    input = stdin.read().split()
    index = 0

    n = int(input[index])
    index += 1
    arr = [0] * n
    sum = 0

    for i in range(n):
        arr[i] = int(input[index])
        index += 1
        sum += arr[i]

    c = 0
    sb = []

    for i in range(n):
        if (sum - arr[i]) % (n - 1) == 0 and (sum - arr[i]) // (n - 1) == arr[i]:
            c += 1
            sb.append(str(i + 1))

    print(c)
    print(" ".join(sb))

if __name__ == "__main__":
    main()

