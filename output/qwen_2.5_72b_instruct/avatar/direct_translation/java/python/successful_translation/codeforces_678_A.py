
import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
k = int(data[1])
n += 1
z = 0
if n % k != 0:
    z = k - n % k
print(n + z)

