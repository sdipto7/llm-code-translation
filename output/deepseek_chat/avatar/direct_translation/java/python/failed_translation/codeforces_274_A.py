
import sys

n, k = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readlines()))
arr.sort()
seen = set()
count = 0
for num in arr:
    if num % k != 0 or (num // k not in seen):
        count += 1
        seen.add(num)
print(count)

