
def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_l = a * a + b * b
    if count > max_l:
        print("NO")
        return
    print("YES")
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        print(''.join(row))

n, count = map(int, input().split())
print_island(n, count)

