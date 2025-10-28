
Sd = input().strip()
T = input().strip()

ok = False
first = -1
end = -1
n = len(Sd)
m = len(T)

for j in range(n):
    count = 0
    for i in range(n - j):
        pos = j + i
        c = Sd[pos]
        if count < m and (c == '?' or c == T[count]):
            count += 1
            if count == m:
                first = pos - m + 1
                end = pos
                ok = True
                break
        else:
            count = 0

if ok:
    res = []
    for i in range(n):
        if first <= i <= end:
            res.append(T[i - first])
        else:
            res.append('a' if Sd[i] == '?' else Sd[i])
    print(''.join(res))
else:
    print("UNRESTORABLE")

