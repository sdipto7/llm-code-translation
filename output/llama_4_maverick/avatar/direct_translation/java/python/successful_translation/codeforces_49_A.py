
s = input().strip()
for i in range(len(s) - 1, -1, -1):
    if s[i] != ' ' and s[i] != '?':
        ch = s[i].lower()
        break
if ch in 'aeiouy':
    print('YES')
else:
    print('NO')

