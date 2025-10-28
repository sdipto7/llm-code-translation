
import sys

nums = list(map(int, sys.stdin.read().split()))
for i in range(5):
    if nums[i] == 0:
        print(i + 1)
        break

