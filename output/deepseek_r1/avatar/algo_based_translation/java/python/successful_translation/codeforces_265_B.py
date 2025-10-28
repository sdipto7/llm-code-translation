
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
arr = data[1:n+1]
ans = arr[0] + 1
for i in range(1, n):
    ans += abs(arr[i] - arr[i-1]) + 2
print(ans)

