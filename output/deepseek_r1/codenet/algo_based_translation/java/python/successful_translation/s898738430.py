
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
a = data[1:n+1]
ans = 0

for i in range(1, n-1):
    current = a[i]
    triplet = [a[i-1], current, a[i+1]]
    if current != min(triplet) and current != max(triplet):
        ans += 1

print(ans)

