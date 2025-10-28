
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
d = data[1]
nums = data[2:2 + n]
result = 0

for i in range(1, n):
    a = nums[i-1] - nums[i]
    if a >= 0:
        increment = (a // d) + 1
        result += increment
        nums[i] += increment * d

print(result)

