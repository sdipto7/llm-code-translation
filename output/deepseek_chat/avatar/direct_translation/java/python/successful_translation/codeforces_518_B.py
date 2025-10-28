
import sys
from collections import defaultdict

s = input()
t = input()
ura = 0
opa = 0
tmap = defaultdict(int)

for ch in t:
    tmap[ch] += 1

length = len(s)
s_list = list(s)

for i in range(length):
    ch = s_list[i]
    if ch in tmap:
        tmap[ch] -= 1
        if tmap[ch] == 0:
            del tmap[ch]
        s_list[i] = 'Я'
        ura += 1

for i in range(length):
    ch = s_list[i]
    rch = ch.lower() if ch.isupper() else ch.upper()
    if rch in tmap:
        tmap[rch] -= 1
        if tmap[rch] == 0:
            del tmap[rch]
        opa += 1

print(f"{ura} {opa}")

