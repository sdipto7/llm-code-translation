
s = input()
x, y = 0, 0
co = [[], []]
co[0].append(x)
co[1].append(y)
for c in s:
    if c == 'L':
        x -= 1
    elif c == 'R':
        x += 1
    elif c == 'U':
        y += 1
    elif c == 'D':
        y -= 1
    co[0].append(x)
    co[1].append(y)
flag = True
length = len(co[0])
for i in range(length - 3):
    for j in range(i + 3, length):
        dx = abs(co[0][i] - co[0][j])
        dy = abs(co[1][i] - co[1][j])
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break
print("OK" if flag else "BUG")

