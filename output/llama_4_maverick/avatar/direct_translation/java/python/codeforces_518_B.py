
def reverse(ch):
    if ch.islower():
        return ch.upper()
    else:
        return ch.lower()

s = input().strip()
t = input().strip()
ura = 0
opa = 0
tmap = {}
for ch in t:
    if ch not in tmap:
        tmap[ch] = 1
    else:
        tmap[ch] += 1
s_list = list(s)
for i in range(len(s_list)):
    ch = s_list[i]
    if ch in tmap:
        tmap[ch] -= 1
        if tmap[ch] == 0:
            del tmap[ch]
        s_list[i] = 'Я'
        ura += 1
for i in range(len(s_list)):
    ch = s_list[i]
    rch = reverse(ch)
    if rch in tmap:
        tmap[rch] -= 1
        if tmap[rch] == 0:
            del tmap[rch]
        opa += 1
print(ura, opa)

