
import math
import sys

sc = sys.stdin
N = int(sc.readline().strip())
min_val = float('inf')
for i in range(5):
    val = int(sc.readline().strip())
    if i == 0:
        min_val = val
    else:
        min_val = min(min_val, val)
print(math.ceil(N / min_val) + 4)

