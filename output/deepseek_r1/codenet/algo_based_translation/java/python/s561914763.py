
ODD = {'R', 'U', 'D'}
EVE = {'L', 'U', 'D'}

s = input().strip()
is_good = True

for i in range(len(s)):
    pos = i + 1
    c = s[i]
    if pos % 2 == 0:
        if c not in EVE:
            is_good = False
            break
    else:
        if c not in ODD:
            is_good = False
            break

print("Yes" if is_good else "No")

