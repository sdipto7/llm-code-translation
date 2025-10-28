
import sys

data = list(map(int, sys.stdin.read().split()))
n, k = data[0], data[1]
arr = data[2:2 + n]
arr.sort()
s = set()
count = 0
for num in arr:
    if num % k != 0:
        count += 1
        s.add(num)
    else:
        div = num // k
        if div not in s:
            count += 1
            s.add(num)
print(count)

