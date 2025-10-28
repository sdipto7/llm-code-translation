
n, count = map(int, input().split())
a = (n + 1) // 2
b = n // 2
max_l = a * a + b * b
if count > max_l:
    print("NO")
else:
    print("YES")
    remaining = count
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and remaining > 0:
                row.append('L')
                remaining -= 1
            else:
                row.append('S')
        print(''.join(row))

