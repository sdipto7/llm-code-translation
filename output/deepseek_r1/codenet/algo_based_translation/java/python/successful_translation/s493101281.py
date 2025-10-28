
import sys

n = int(sys.stdin.readline())
l = list(map(int, sys.stdin.read().split()))[:n]
l.sort()
print(l[n//2] - l[n//2 - 1])

