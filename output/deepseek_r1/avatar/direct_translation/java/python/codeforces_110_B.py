n = int(input())
result = [''] * n
p = 97
for i in range(4):
    for j in range(i, n, 4):
        result[j] = chr(p)
    p += 1
print(''.join(result))
