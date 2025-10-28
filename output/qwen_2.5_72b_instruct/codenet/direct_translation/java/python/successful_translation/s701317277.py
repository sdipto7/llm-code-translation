
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
min_val = float('inf')
count = 0
sum_val = 0

for num in A:
    if num < 0:
        count += 1
    min_val = min(min_val, abs(num))
    sum_val += abs(num)

if count % 2 == 0:
    print(sum_val)
else:
    print(sum_val - min_val * 2)

