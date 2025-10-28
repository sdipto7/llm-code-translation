
import sys

n = int(sys.stdin.readline().strip())
array = [sys.stdin.readline().strip() for _ in range(n)]
array.sort()

a = array[0]
cnt = 1
for i in range(n):
    if a != array[i]:
        cnt += 1
    a = array[i]

print(cnt)

