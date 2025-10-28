
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
nums = data[1:n+1] if n > 0 else []

min_abs = float('inf')
count_neg = 0
total = 0

for num in nums:
    abs_val = abs(num)
    total += abs_val
    if abs_val < min_abs:
        min_abs = abs_val
    if num < 0:
        count_neg += 1

if count_neg % 2 == 0:
    print(total)
else:
    print(total - 2 * min_abs)

