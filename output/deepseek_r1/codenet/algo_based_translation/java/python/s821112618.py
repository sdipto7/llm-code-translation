
keys_str = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz"
k = [list(part) for part in keys_str.split(':')]

n = int(input())
for _ in range(n):
    s = input().strip()
    l = -1
    a = 0
    for c in s:
        if c != '0':
            a = ord(c) - ord('1')
            l = (l + 1) % len(k[a])
        elif l >= 0:
            print(k[a][l], end='')
            l = -1
    print()

