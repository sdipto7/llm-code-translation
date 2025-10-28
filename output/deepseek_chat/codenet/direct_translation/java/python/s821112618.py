
s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
k = [list(x) for x in s]
n = int(input())
for _ in range(n):
    c = input()
    l, a = -1, 0
    for char in c:
        if char != '0':
            a = int(char) - 1
            l = (l + 1) % len(k[a])
        elif l >= 0:
            print(k[a][l], end='')
            l = -1
    print()

