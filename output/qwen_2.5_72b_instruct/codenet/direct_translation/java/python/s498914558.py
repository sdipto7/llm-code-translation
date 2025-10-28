
import sys
input = sys.stdin.read
data = list(map(int, input().split()))
n = data[0]
m = data[1]
po = data[2:]
for i in range(n):
    m -= po[i]
po.sort()
print(n + m // po[0])

