
s = input().strip()
length = len(s)
ch = ''
for i in range(length - 1, -1, -1):
    if s[i] not in ' ?':
        ch = s[i]
        break
ch = ch.lower()
if ch in {'a', 'e', 'i', 'o', 'u', 'y'}:
    print("YES")
else:
    print("NO")

