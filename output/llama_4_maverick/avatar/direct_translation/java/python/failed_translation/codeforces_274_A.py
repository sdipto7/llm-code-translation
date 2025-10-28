
import sys
n = int(sys.stdin.readline().strip())
k = int(sys.stdin.readline().strip())
arr = list(map(int, sys.stdin.readline().strip().split()))
if n == 1:
    arr = [int(sys.stdin.readline().strip())]
arr.sort()
count = 0
s = set()
for i in arr:
    if i % k != 0:
        count += 1
        s.add(i)
    elif i // k not in s:
        count += 1
        s.add(i)
print(count)

