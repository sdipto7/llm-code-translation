
s = input().strip()
t = input().strip()
flag = False
for _ in range(len(s)):
    s = s[1:] + s[0]
    if s == t:
        flag = True
        break
print("Yes" if flag else "No")

