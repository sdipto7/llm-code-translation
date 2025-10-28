n, m = map(int, input().split())
strings = [input().strip() for _ in range(n)]
flag = 0
differences = []
for s in strings:
    g = s.index('G')
    s_pos = s.index('S')
    if g > s_pos:
        flag = -1
    differences.append(s_pos - g)
print(-1 if flag == -1 else len(set(differences)))
