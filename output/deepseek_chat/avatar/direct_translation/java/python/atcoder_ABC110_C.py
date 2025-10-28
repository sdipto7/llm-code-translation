
S = input()
T = input()
A = [chr(i) for i in range(ord('a'), ord('z')+1)]
res = True
for s in A:
    s_idx = S.find(s)
    if s_idx < 0:
        continue
    t = T[s_idx]
    idx = 0
    while idx < len(S):
        if S.find(s, idx) >= 0:
            if S.find(s, idx) != T.find(t, idx):
                res = False
                break
            else:
                idx = S.find(s, idx) + 1
        elif T.find(t, idx) >= 0:
            res = False
            break
        else:
            break
    if not res:
        break
print("Yes" if res else "No")

