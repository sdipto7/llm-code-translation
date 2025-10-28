
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
a = data[1:n+1]
a.sort()
min_val = a[0]
for val in a:
    if val % min_val != 0:
        print(-1)
        sys.exit()
print(min_val)

