
s = input()
ch = None
for i in range(len(s)-1, -1, -1):
    if s[i] not in {' ', '?'}:
        ch = s[i]
        break
if ch is None:
    print("NO")
else:
    ch_lower = ch.lower()
    if ch_lower in {'a', 'e', 'i', 'o', 'u', 'y'}:
        print("YES")
    else:
        print("NO")

