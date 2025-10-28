import sys
input = sys.stdin.read
data = input().split()

x = int(data[0])
count = 0
tmp = x
x = 0

while x != 360:
    x = x + tmp
    if x > 360:
        x = x - 360
    count += 1

print(count)
