import sys
import math

def main():
    import sys
    import math
    import sys
    from sys import stdin, stdout

    n = int(sys.stdin.readline())
    pre = [0] * (n + 1)

    for i in range(1, n + 1):
        pre[i] = pre[i - 1] + int(sys.stdin.readline())

    min_diff = float('inf')

    for i in range(1, n):
        val1 = pre[i]
        val2 = pre[n] - pre[i]
        min_diff = min(min_diff, abs(val1 - val2))

    stdout.write(str(min_diff) + '\n')

if __name__ == "__main__":
    main()
