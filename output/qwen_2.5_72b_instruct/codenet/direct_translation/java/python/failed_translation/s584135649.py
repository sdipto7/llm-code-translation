import sys

sc = sys.stdin

i = 0

for i in range(1, 6):
    n = int(sc.readline().strip())
    if n == 0:
        break

print(i)
