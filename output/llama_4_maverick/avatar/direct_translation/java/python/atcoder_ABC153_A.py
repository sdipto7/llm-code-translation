
import sys
h, a = map(int, sys.stdin.readline().split())
num = 0
i = 1
while h > 0:
    h -= a
    num += 1
    i += 1
print(num)

