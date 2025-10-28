
s, k = input().split()
k = int(k)
res = []
for c in s:
    if c != 'a':
        cost = 26 - (ord(c) - ord('a'))
        if cost <= k:
            res.append('a')
            k -= cost
        else:
            res.append(c)
    else:
        res.append(c)
if k > 0:
    last_char = res.pop()
    new_ord = (ord(last_char) - ord('a') + k) % 26
    res.append(chr(ord('a') + new_ord))
print(''.join(res))

