
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
nums = data[1:n+1]

arr = [i for i, num in enumerate(nums) if num == 1]

if not arr:
    print(0)
else:
    product = 1
    for i in range(1, len(arr)):
        product *= arr[i] - arr[i-1]
    print(product)

