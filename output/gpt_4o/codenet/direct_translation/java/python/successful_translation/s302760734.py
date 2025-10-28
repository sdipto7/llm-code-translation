
s, t = input(), input()
check = False
for i in range(len(s) - len(t), -1, -1):
    check2 = True
    for j in range(len(t)):
        if s[i + j] != '?' and s[i + j] != t[j]:
            check2 = False
    if check2:
        check = True
        s = s[:i] + t + s[i + len(t):]
    if check:
        break
if check:
    result = ''.join('a' if c == '?' else c for c in s)
    print(result)
else:
    print("UNRESTORABLE")

