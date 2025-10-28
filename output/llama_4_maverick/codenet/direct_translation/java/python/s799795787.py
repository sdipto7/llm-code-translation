
import sys
n = int(sys.stdin.readline().strip())
array = [sys.stdin.readline().strip() for _ in range(n)]
array.sort()
cnt = 1
a = array[0]
for i in range(n):
    if not a == array[i]:
        cnt += 1
    a = array[i]
print(cnt)

