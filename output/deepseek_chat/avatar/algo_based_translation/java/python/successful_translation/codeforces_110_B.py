
n = int(input())
p = 97
c = [''] * n

for i in range(4):
    j = i
    while j < n:
        c[j] = chr(p)
        j += 4
    p += 1

for i in range(n):
    print(c[i], end='')

