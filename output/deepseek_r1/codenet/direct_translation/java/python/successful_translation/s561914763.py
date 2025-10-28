
ODD = {'R', 'U', 'D'}
EVE = {'L', 'U', 'D'}

s = input().strip()
is_good = True

for i in range(len(s)):
    char = s[i]
    if (i + 1) % 2 == 0:
        if char not in EVE:
            is_good = False
            break
    else:
        if char not in ODD:
            is_good = False
            break

print("Yes" if is_good else "No")

