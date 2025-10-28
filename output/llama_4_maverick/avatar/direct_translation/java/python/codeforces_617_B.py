
import sys
n = int(sys.stdin.readline())
arr = [i for i in range(n) if int(sys.stdin.readline().split()[0]) == 1]
if not arr:
    print(0)
else:
    result = 1
    for i in range(1, len(arr)):
        result *= arr[i] - arr[i-1]
    print(result)

