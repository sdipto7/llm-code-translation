n = int(input())
m = int(input())
po = [0] * n
for i in range(n):
    po[i] = int(input())
    m -= po[i]
po.sort()
result = n + m // po[0]
print(result)
