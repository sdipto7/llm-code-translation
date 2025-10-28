
import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
a = sum(int(data[i]) for i in range(1, n + 1))
b = sum(int(data[i]) for i in range(n + 1, 2 * n))
c = sum(int(data[i]) for i in range(2 * n + 1, 3 * n - 2))

x = a - b
y = b - c

print(x)
print(y)

