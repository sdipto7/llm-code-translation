
def rotate(s):
    t = s[0]
    s = s[1:] + t
    return s

s = input().split()
flag = False
for _ in range(len(s[0])):
    s[0] = rotate(s[0])
    if s[1] == s[0]:
        flag = True
        break
if flag:
    print('Yes')
else:
    print('No')

