
s = input().strip()
k = int(input())
chars = []

for c in s:
    if c != 'a':
        required = 26 - (ord(c) - ord('a'))
        if required <= k:
            k -= required
            chars.append('a')
        else:
            chars.append(c)
    else:
        chars.append(c)

if k > 0 and chars:
    t = chars[-1]
    chars.pop()
    new_ord = (ord(t) - ord('a') + k) % 26
    chars.append(chr(ord('a') + new_ord))

print(''.join(chars))

