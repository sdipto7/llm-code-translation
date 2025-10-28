
import sys

input = sys.stdin.readline

str = input().strip().split()
h = int(str[0])
a = int(str[1])
num = 0
for i in range(1, h + 1):
    if h <= 0:
        break
    h = h - a
    num += 1

print(num)

