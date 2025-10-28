
import sys
n = int(sys.stdin.readline().strip())
a = list(map(int, sys.stdin.readline().strip().split()))
result, pos, flag = 0, 0, 0
if a[0] > 15:
    result = 15
else:
    for i in range(1, n):
        if a[i] - a[i-1] > 15:
            pos = i-1
            flag = 1
            break
    if flag == 1:
        result = a[pos] + 15
    else:
        result = a[n-1] + 15
if result > 90:
    result = 90
print(result)

