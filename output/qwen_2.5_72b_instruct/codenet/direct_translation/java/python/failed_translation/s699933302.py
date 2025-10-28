import sys

a = int(sys.stdin.read().split()[0])
b = int(sys.stdin.read().split()[1])
c = int(sys.stdin.read().split()[2])
count = 0
for i in range(a, b + 1):
    if c % i == 0:
        count += 1
print(count)
