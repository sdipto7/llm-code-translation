
import sys

n = int(sys.stdin.readline().strip())
a = list(map(int, sys.stdin.readline().strip().split()))
a.sort()
for i in range(len(a) - 1):
    if a[i + 1] < a[i] * 2 and a[i] != a[i + 1]:
        print("YES")
        sys.exit()
print("NO")

