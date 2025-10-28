
import sys
n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
a.sort()
min_val = a[0]
for value in a:
    if value % min_val != 0:
        print(-1)
        sys.exit()
print(min_val)

