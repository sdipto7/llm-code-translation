
import sys

data = list(map(int, sys.stdin.read().split()))
n, d = data[0], data[1]
nums = data[2:2 + n]
result = 0

for i in range(1, n):
    a = nums[i-1] - nums[i]
    if a >= 0:
        add = a // d + 1
        result += add
        nums[i] += add * d

print(result)

