
import sys

data = list(map(int, sys.stdin.read().split()))
N = data[0]
numbers = data[1:N+1]

max_val = numbers[0]
min_val = numbers[0]

for num in numbers[1:]:
    if num > max_val:
        max_val = num
    if num < min_val:
        min_val = num

print(max_val - min_val)

