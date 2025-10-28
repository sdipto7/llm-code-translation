import sys
from collections import Counter

input = sys.stdin.read().strip()
map = Counter(input)
oddCount = 0
for value in map.values():
    if value % 2 != 0:
        oddCount += 1
if oddCount <= 1 or oddCount % 2 != 0:
    print("First")
else:
    print("Second")
