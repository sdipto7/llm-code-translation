
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
a = data[1:n+1]

if a[0] > 15:
    result = 15
else:
    pos = 0
    flag = 0
    for i in range(1, len(a)):
        if a[i] - a[i-1] > 15:
            pos = i-1
            flag = 1
            break
    result = a[pos] + 15 if flag == 1 else a[-1] + 15

result = min(result, 90)
print(result)

