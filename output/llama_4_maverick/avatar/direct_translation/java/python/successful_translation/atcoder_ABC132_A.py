
s = input().strip()
targ = list(s)
map = {}
for c in targ:
    if c not in map:
        map[c] = 1
    else:
        map[c] += 1
ok = True
for k, v in map.items():
    if v != 2:
        ok = False
        break
if ok and len(map) == 2:
    print("Yes")
else:
    print("No")

