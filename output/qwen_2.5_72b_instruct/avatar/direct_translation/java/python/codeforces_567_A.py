
import sys

a = int(sys.stdin.readline())
ar = list(map(int, sys.stdin.readline().split()))
max_val = 0
min_val = 0

for i in range(a):
    max_val = max(ar[i] - ar[0], ar[a - 1] - ar[i])
    if i == 0:
        min_val = ar[i + 1] - ar[i]
    elif i == a - 1:
        min_val = ar[i] - ar[i - 1]
    else:
        min_val = min(ar[i] - ar[i - 1], ar[i + 1] - ar[i])
    print(min_val, max_val)

