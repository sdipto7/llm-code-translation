
s = list(input().strip())
t = list(input().strip())
check = False

for i in range(len(s) - len(t), -1, -1):
    valid = True
    for j in range(len(t)):
        if s[i + j] != '?' and s[i + j] != t[j]:
            valid = False
            break
    if valid:
        for j in range(len(t)):
            s[i + j] = t[j]
        check = True
        break

print(''.join(['a' if c == '?' else c for c in s]) if check else "UNRESTORABLE")

