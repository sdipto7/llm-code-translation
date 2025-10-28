
n, m = map(int, input().split())
po = list(map(int, input().split()))
for i in range(n):
    m -= po[i]
po.sort()
print(n + m // po[0])

