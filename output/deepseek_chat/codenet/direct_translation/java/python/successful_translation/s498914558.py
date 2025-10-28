
n, m = map(int, input().split())
po = [int(input()) for _ in range(n)]
m -= sum(po)
po.sort()
print(n + m // po[0])

