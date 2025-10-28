
import sys
input = sys.stdin.read().split()

n = int(input[0])
arr = []
for i in range(1, n + 1):
    if int(input[i]) == 1:
        arr.append(i - 1)

if not arr:
    print(0)
else:
    result = 1
    for i in range(1, len(arr)):
        result *= arr[i] - arr[i - 1]
    print(result)

