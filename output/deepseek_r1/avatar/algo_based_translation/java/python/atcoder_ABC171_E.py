
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
a = data[1:n+1]

r = 0
for num in a:
    r ^= num

print(' '.join(str(r ^ x) for x in a))

