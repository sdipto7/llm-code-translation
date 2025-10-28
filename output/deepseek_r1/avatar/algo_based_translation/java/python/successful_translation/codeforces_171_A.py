
import sys

def reverse(n):
    if n < 10:
        return n * 10
    t, r = n, 0
    while t > 0:
        r = r * 10 + t % 10
        t = t // 10
    return r

n, m = map(int, sys.stdin.readline().split())
print(n + reverse(m))

