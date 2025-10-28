h, w, n = map(int, input().split())
sr, sc = map(int, input().split())
s = input().strip()
t = input().strip())

end = False

usafe, dsafe = 1, h
for i in range(n-1, -1, -1):
    c = s[i]
    if c == 'U':
        usafe += 1
    elif c == 'D':
        dsafe -= 1
    if usafe > dsafe:
        end = True
        break
    if i > 0:
        tc = t[i-1]
        if tc == 'U':
            dsafe = min(dsafe + 1, h)
        elif tc == 'D':
            usafe = max(usafe - 1, 1)

lsafe, rsafe = 1, w
for i in range(n-1, -1, -1):
    c = s[i]
    if c == 'L':
        lsafe += 1
    elif c == 'R':
        rsafe -= 1
    if lsafe > rsafe:
        end = True
        break
    if i > 0:
        tc = t[i-1]
        if tc == 'L':
            rsafe = min(rsafe + 1, w)
        elif tc == 'R':
            lsafe = max(lsafe - 1, 1)

print("YES" if usafe <= sr <= dsafe and lsafe <= sc <= rsafe and not end else "NO")
