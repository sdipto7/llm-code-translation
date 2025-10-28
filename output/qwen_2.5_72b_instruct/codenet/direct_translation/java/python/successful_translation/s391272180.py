import sys

sc = sys.stdin.read().split()
s = sc[0]
t = sc[1]
flag = False
for i in range(len(s)):
    s = s[1:] + s[0]
    if t == s:
        flag = True
        break
if flag:
    print("Yes")
else:
    print("No")
