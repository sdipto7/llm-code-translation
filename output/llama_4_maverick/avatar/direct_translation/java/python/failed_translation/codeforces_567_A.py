
import sys
a = int(sys.stdin.readline().strip())
ar = list(map(int, sys.stdin.readline().strip().split()))
for i in range(a):
    if i == 0:
        min_val = ar
