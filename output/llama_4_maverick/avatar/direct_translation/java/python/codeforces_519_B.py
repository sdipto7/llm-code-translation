
import sys
n = int(sys.stdin.readline())
a = sum(map(int, sys.stdin.readline().split()))
b = sum(map(int, sys.stdin.readline().split()))
c = sum(map(int, sys.stdin.readline().split()))
x = a - b
y = b - c
print(x)
print(y)

