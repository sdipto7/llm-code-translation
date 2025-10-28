
import sys

n = int(sys.stdin.readline().strip())
array = list(map(int, sys.stdin.readline().strip().split()))
array.sort()
head = len(array) - 2
res = 0
for _ in range(n):
    res += array[head]
    head -= 2
print(res)

