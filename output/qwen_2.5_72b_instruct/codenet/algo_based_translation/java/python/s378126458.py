
import sys

def main():
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
    N = int(input[index])
    Q = int(input[index + 1])
    s = input[index + 2]
    pre = [0] * (N + 1)
    index += 3

    for i in range(1, N):
        if s[i - 1] == 'A' and s[i] == 'C':
            pre[i] = 1

    for i in range(1, N):
        pre[i] += pre[i - 1]

    for _ in range(Q):
        l = int(input[index])
        r = int(input[index + 1])
        index += 2
        r -= 1
        print(pre[r] - pre[l - 1])

if __name__ == "__main__":
    main()

