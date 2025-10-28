
import sys

data = list(map(int, sys.stdin.read().split()))
count = data[0]
giving_numbers = data[1:1 + count]

for i in range(count - 1, -1, -1):
    print(giving_numbers[i], end='')
    if i > 0:
        print(' ', end='')
print()

