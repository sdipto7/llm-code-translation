
import sys
from collections import Counter

s = input().strip()
count = Counter(s)
ok = True
for value in count.values():
    if value != 2:
        ok = False
        break
if ok and len(count) == 2:
    print("Yes")
else:
    print("No")

