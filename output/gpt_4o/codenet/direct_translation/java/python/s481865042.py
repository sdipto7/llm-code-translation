
s = input()
k = int(input())
sb = []
for i in range(len(s)):
    if (26 - (ord(s[i]) - ord('a'))) <= k and s[i] != 'a':
        k -= 26 - (ord(s[i]) - ord('a'))
        sb.append('a')
    else:
        sb.append(s[i])
if k > 0:
    t = sb[-1]
    sb[-1] = chr(ord('a') + (ord(t) - ord('a') + k) % 26)
print(''.join(sb))

