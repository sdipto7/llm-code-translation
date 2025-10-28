import sys
from itertools import islice

N = int(input())
numbers = list(map(int, islice(sys.stdin, N)))

count = 0

while True:
    numbers = [i // 2 for i in numbers if i % 2 == 0]
    if len(numbers) == N:
        count += 1
    else:
        break

print(count)
