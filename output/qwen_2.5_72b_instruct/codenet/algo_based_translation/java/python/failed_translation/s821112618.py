
import sys

def main():
    import sys
    import re

    def read_int():
        return int(sys.stdin.readline())

    def read_string():
        return sys.stdin.readline().strip()

    sc = sys.stdin
    n = read_int()
    s = ",.!?:abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
    k = [list(x) for x in s]

    while n > 0:
        c = list(read_string())
        l = -1
        a = 0
        for i in range(len(c)):
            if c[i] != '0':
                a = ord(c[i]) - ord('1')
                l = (l + 1) % len(k[a])
            elif l >= 0:
                print(k[a][l], end='')
                l = -1
        print()
        n -= 1

if __name__ == "__main__":
    main()

