
import sys

n, *rest = map(int, sys.stdin.read().split())
a = rest[:n]
a.sort()
for i in range(1, n):
    if a[i] == a[i-1]:
        print("NO")
        exit()
print("YES")

