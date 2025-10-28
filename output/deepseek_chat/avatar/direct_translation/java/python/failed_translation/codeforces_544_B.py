
n, count = int(input()), int(input())
a = (n + 1) // 2
b = n // 2
max_val = a * a + b * b
if count > max_val:
    print("NO")
else:
    print("YES")
    for i in range(n):
        s = ''
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                s += 'L'
                count -= 1
            else:
                s += 'S'
        print(s)

