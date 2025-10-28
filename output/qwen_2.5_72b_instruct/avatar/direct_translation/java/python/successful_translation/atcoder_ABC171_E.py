
import sys
input = sys.stdin.read
n, *a = map(int, input().split())
r = 0
for x in a:
    r ^= x
for i in range(n):
    if i != 0:
        print(' ', end='')
    print(r ^ a[i], end='')

