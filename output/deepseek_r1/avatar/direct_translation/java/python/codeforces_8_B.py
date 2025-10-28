s = input().strip()
x, y = 0, 0
co_x = [0]
co_y = [0]
for c in s:
    if c == 'L':
        x -= 1
    elif c == 'R':
        x += 1
    elif c == 'U':
        y += 1
    else:
        y -= 1
    co_x.append(x)
    co_y.append(y)
flag = True
n = len(co_x)
for i in range(n - 3):
    for j in range(i + 3, n):
        dx = abs(co_x[i] - co_x[j])
        dy = abs(co_y[i] - co_y[j])
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break
print("OK" if flag else "BUG")
