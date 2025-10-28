
import sys
n, m = map(int, sys.stdin.readline().split())
po = [int(sys.stdin.readline()) for _ in range(n)]
m -= sum(po)
po.sort()
print(n + m // po[0])

