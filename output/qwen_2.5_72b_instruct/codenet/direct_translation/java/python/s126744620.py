
import sys

input = sys.stdin.read().split()
n = int(input[0])
k = int(input[1])
a = list(map(int, input[2:2+n]))
x = [0] * 200010
for i in range(n):
    x[a[i] - 1] += 1
x.sort()
ans = sum(x[:200010 - k])
print(ans)

