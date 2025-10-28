
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
array = data[1:n+1]
max_val = 0
min_val = 10000
for num in array:
    if num > max_val:
        max_val = num
    if num < min_val:
        min_val = num
print(max_val - min_val)

