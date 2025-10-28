
import sys

tokens = sys.stdin.read().split()
Sd = tokens[0]
T = tokens[1]

len_Sd = len(Sd)
len_T = len(T)
ok = False
first = -1
end = -1

for j in range(len_Sd):
    count = 0
    for i in range(len_Sd - j):
        current_pos = j + i
        c = Sd[current_pos]
        if count < len_T and (c == '?' or c == T[count]):
            count += 1
            if count == len_T:
                first = current_pos - len_T + 1
                end = current_pos
                ok = True
                break
        else:
            count = 0

if ok:
    res = []
    for i in range(len_Sd):
        if first <= i <= end:
            res.append(T[i - first])
        else:
            res.append('a' if Sd[i] == '?' else Sd[i])
    print(''.join(res))
else:
    print("UNRESTORABLE")

