
import sys

input = sys.stdin.read
data = input().split()

x = int(data[0])
y = int(data[1])
a = int(data[2])
b = int(data[3])

count = 0
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        count += 1

print(count)
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        print(i, j)

