
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
m = data[1]
po = data[2:2 + n]

for num in po:
    m -= num

po.sort()
print(n + m // po[0])

