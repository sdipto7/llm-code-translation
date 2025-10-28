
n = int(input())
ss = [input().strip() for _ in range(n)]
cc = list(input().strip())
c = input().strip()
m = len(cc)

c_upper = c.upper()
a_char = 'b' if c == 'a' else 'a'
a_upper = a_char.upper()
lucky = [False] * m

for s in ss:
    l = len(s)
    s_upper = s.upper()
    for j in range(m - l + 1):
        if ''.join(cc[j:j+l]).upper() == s_upper:
            for h in range(l):
                lucky[j + h] = True

for j in range(m):
    if lucky[j]:
        original = cc[j]
        if original.lower() == c:
            cc[j] = a_upper if original.isupper() else a_char
        else:
            cc[j] = c_upper if original.isupper() else c.lower()

print(''.join(cc))

