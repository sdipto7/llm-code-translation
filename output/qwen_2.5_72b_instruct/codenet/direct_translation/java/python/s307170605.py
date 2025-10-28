
import sys

sc = map(int, sys.stdin.read().split())

for i in range(5):
    if next(sc) == 0:
        print(i + 1)
        break

