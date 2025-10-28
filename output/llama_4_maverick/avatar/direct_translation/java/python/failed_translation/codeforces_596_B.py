
import sys
n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline().strip()) if i == 0 else int(sys.stdin.readline().strip()) for i in range(n)]
answer = abs(arr[0])
for i in range(1, n):
    answer += abs(arr[i] - arr[i - 1])
print(answer)

However, a more pythonic and precise translation would be:

import sys
n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.read().split()))
answer = abs(arr[0])
for i in range(1, n):
    answer += abs(arr[i] - arr[i - 1])
print(answer)

