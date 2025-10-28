
import sys
from collections import defaultdict

scan = sys.stdin.read().split()
s = list(scan[0])
t = scan[1]
ura = 0
opa = 0
tmap = defaultdict(int)

for i in range(len(t)):
    ch = t[i]
    tmap[ch] += 1

length = len(s)
for i in range(length):
    ch = s[i]
    if ch in tmap:
        tmap[ch] -= 1
        if tmap[ch] == 0:
            del tmap[ch]
        s[i] = 'Я'
        ura += 1

for i in range(length):
    ch = s[i]
    rch = ch.lower() if ch.isupper() else ch.upper()
    if rch in tmap:
        tmap[rch] -= 1
        if tmap[rch] == 0:
            del tmap[rch]
        opa += 1

print(ura, opa)

