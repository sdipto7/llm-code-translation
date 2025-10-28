
s = list(input().strip())
t = list(input().strip())
check = False

for i in range(len(s) - len(t), -1, -1):
    check2 = True
    for j in range(len(t)):
        if s[i + j] != '?' and s[i + j] != t[j]:
            check2 = False
    if check2:
        check = True
        for j in range(len(t)):
            s[i + j] = t[j]
        break

if check:
    print(''.join(['a' if c == '?' else c for c in s]))
else:
    print("UNRESTORABLE")

