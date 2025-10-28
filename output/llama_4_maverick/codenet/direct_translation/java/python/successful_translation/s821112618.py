
import sys

s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
k = [list(x) for x in s]
for _ in range(int(sys.stdin.readline())):
    c = sys.stdin.readline().strip()
    l, a = -1, 0
    for x in c:
        if x != '0':
            a = ord(x) - ord('1')
            l = (l + 1) % len(k[a])
        elif l >= 0:
            print(k[a][l], end='')
            l = -1
    print()

