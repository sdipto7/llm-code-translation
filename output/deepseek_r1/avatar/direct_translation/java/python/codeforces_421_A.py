
import sys

data = list(map(int, sys.stdin.read().split()))
n, a, b = data[0], data[1], data[2]
list1 = data[3:3+a]
for i in range(1, n+1):
    print(1 if i in list1 else 2, end=' ')

