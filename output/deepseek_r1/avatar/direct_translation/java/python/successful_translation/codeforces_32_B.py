n = input().strip()
s = False
res = []
for c in n:
    if c == '.':
        if s:
            res.append('1')
            s = False
        else:
            res.append('0')
    else:
        if s:
            res.append('2')
            s = False
        else:
            s = True
print(''.join(res))
