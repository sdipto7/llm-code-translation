
import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
k = int(data[1])
l = 0
c = 1
for i in range(2, 2 + n):
    a = int(data[i])
    if a == l:
        c += 1
    else:
        c = 1
    l = a
if c + k > n:
    print(n - c)
else:
    print(-1)

