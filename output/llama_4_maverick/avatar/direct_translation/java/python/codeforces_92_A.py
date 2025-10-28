
import sys
n, k = map(int, sys.stdin.readline().split())
i, req = 1, 1
while k - req >= 0:
    k -= req
    i += 1
    req = i % n or n
print(k)

