
import sys
len = int(sys.stdin.readline().strip())
a = list(map(int, sys.stdin.readline().split()))
l = 0
r = 0
flag = False
isTrue = False
for i in range(len):
    if a[i] != i + 1 and not flag:
        l = i + 1
        flag = True
        continue
    if a[i] != i + 1 and flag:
        r = i + 1
        if r > 1 and a[r - 1] - a[r - 2] > 0:
            isTrue = True
            break
if isTrue:
    print("0 0")
else:
    print(l, r)

