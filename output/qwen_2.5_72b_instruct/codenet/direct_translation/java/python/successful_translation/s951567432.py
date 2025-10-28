import sys

count = int(sys.stdin.readline())

total = 0
for ix in range(1, count + 1):
    total += ix

print(total)
