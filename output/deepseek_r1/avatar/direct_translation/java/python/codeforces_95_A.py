
n = int(input())
ss = [input().strip() for _ in range(n)]
cc = list(input().strip())
c = input().strip()[0]
m = len(cc)
lucky = [False] * m

for s in ss:
    len_s = len(s)
    for j in range(m - len_s + 1):
        if s.upper() == ''.join(cc[j:j+len_s]).upper():
            for h in range(len_s):
                lucky[j + h] = True

a = 'b' if c.lower() == 'a' else 'a'
a_upper = a.upper()
c_upper = c.upper()

for j in range(m):
    if lucky[j]:
        original = cc[j]
        if original.lower() == c:
            cc[j] = a_upper if original.isupper() else a
        else:
            cc[j] = c_upper if original.isupper() else c.lower()

print(''.join(cc))

