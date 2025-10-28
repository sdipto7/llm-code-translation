
import string

S = input().strip()
T = input().strip()
res = True

for s in string.ascii_lowercase:
    s_idx = S.find(s)
    if s_idx == -1:
        continue
    t_char = T[s_idx]
    idx = 0
    while idx < len(S):
        s_pos = S.find(s, idx)
        t_pos = T.find(t_char, idx)
        if s_pos != -1:
            if s_pos != t_pos:
                res = False
                break
            idx = s_pos + 1
        else:
            if T.find(t_char, idx) != -1:
                res = False
                break
            else:
                break
    if not res:
        break

print("Yes" if res else "No")

