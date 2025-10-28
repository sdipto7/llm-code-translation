
n = int(input())
a = [0] * 1000
i, k = 0, 0
while k <= n:
    i = (i + k) % n
    a[i] += 1
    k += 1
flag = all(a[i] != 0 for i in range(n))
print('YES' if flag else 'NO')

