
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
d = sum(x % 2 for x in data[1:n+1])
print("YES" if d % 2 == 0 else "NO")

