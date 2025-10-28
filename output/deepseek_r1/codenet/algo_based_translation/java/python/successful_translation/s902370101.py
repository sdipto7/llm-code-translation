
import sys

n = int(sys.stdin.readline())
numbers = map(int, sys.stdin.read().split())

max_val = 0
min_val = 10000
array = []

for _ in range(n):
    num = next(numbers)
    array.append(num)
    if num > max_val:
        max_val = num
    if num < min_val:
        min_val = num

print(max_val - min_val)

