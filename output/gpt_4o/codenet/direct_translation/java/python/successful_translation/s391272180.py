
def rotate(s):
    return s[1:] + s[0]

s = input()
t = input()
flag = False

for i in range(len(s)):
    s = rotate(s)
    if t == s:
        flag = True
        break

if flag:
    print("Yes")
else:
    print("No")

