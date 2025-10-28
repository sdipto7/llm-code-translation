
from collections import Counter

s = input().strip()
targ = list(s)
count_map = Counter(targ)

ok = True
for value in count_map.values():
    if value != 2:
        ok = False
        break

if ok and len(count_map) == 2:
    print("Yes")
else:
    print("No")

