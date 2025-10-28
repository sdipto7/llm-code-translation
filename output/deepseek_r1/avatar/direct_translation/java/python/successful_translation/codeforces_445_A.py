n, m = map(int, input().split())
for i in range(n):
    s = input().strip()
    row = []
    for j in range(m):
        c = s[j]
        if c == '-':
            row.append('-')
        else:
            row.append('W' if (i + j) % 2 else 'B')
    print(''.join(row))
