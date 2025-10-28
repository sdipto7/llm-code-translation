
def reverse(ch):
    if ch.islower():
        return ch.upper()
    else:
        return ch.lower()

s = input().strip()
t = input().strip()
tmap = {}
for ch in t:
    if ch in tmap:
        tmap[ch] += 1
    else:
        tmap[ch] = 1

ura = 0
s_list = list(s)
for i in range(len(s)):
    ch = s_list[i]
    if ch in tmap:
        if tmap[ch] == 1:
            del tmap[ch]
        else:
            tmap[ch] -= 1
        s_list[i] = 'Я'
        ura += 1

opa = 0
for i in range(len(s_list)):
    if s_list[i] == 'Я':
        rch = reverse(s_list[i])
        if rch in tmap:
            if tmap[rch] == 1:
                del tmap[rch]
            else:
                tmap[rch] -= 1
            opa += 1

print(ura, opa)

