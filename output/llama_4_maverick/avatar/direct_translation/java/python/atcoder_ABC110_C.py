
import sys
S = sys.stdin.readline().strip()
T = sys.stdin.readline().strip()
A = [chr(i) for i in range(ord('a'), ord('z')+1)]
res = True
for s in A:
    sIdx = S.find(s)
    if sIdx < 0:
        continue
    t = T[sIdx]
    idx = 0
    while idx < len(S):
        s_idx = S.find(s, idx)
        t_idx = T.find(t, idx)
        if s_idx >= 0:
            if s_idx != t_idx:
                res = False
                break
            else:
                idx = s_idx + 1
        elif t_idx >= 0:
            res = False
            break
        else:
            break
    if not res:
        break
if res:
    print("Yes")
else:
    print("No")

