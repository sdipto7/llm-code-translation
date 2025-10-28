
import sys
input = sys.stdin.read
data = input().split()

n = int(data[0])
m = int(data[1])
x = int(data[2])
min_value = float('inf')

a = [[0] * (m + 1) for _ in range(n)]
index = 3
for i in range(n):
    for j in range(m + 1):
        a[i][j] = int(data[index])
        index += 1

for i in range(2 ** n):
    status = [0] * n
    for j in range(n):
        if (1 & (i >> j)) == 1:
            status[j] = 1
    res = [0] * (m + 1)
    for j in range(n):
        if status[j] == 1:
            for k in range(m + 1):
                res[k] += a[j][k]
    flag = True
    for j in range(1, m + 1):
        if res[j] < x:
            flag = False
            break
    if flag:
        min_value = min(min_value, res[0])

if min_value == float('inf'):
    print(-1)
else:
    print(min_value)

