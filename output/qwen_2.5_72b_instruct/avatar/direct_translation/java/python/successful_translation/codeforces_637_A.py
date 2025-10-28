
import sys
from collections import Counter

n = int(input())
ara = list(map(int, input().split()))
map = Counter(ara)
max_val = max(map.values())
mm = {}

for i in range(n):
    if ara[i] not in mm:
        mm[ara[i]] = 1
        if mm[ara[i]] == max_val:
            print(ara[i])
            break
    else:
        mm[ara[i]] += 1
        if mm[ara[i]] == max_val:
            print(ara[i])
            break

