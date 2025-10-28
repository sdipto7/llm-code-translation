
import sys
from collections import Counter

s1 = sys.stdin.readline().strip()
s2 = sys.stdin.readline().strip()

if not set(s2).issubset(set(s1)):
    print(-1)
else:
    count1 = Counter(s1)
    count2 = Counter(s2)
    total = 0
    for char in count2:
        total += min(count1[char], count2[char])
    print(total)

