
import sys
from collections import Counter

n = int(sys.stdin.readline())
counts = Counter(map(int, sys.stdin.readline().split()))
ans = 0
for val, num in counts.items():
    if num > val:
        ans += num - val
    elif num < val:
        ans += num
print(ans)

