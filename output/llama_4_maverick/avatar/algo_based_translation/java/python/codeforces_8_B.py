
def main():
    x, y, k = 0, 0, 0
    flag = True
    s = input().strip()
    ch = list(s)
    co = [[0 for _ in range(101)] for _ in range(2)]
    co[0][k] = x
    co[1][k] = y
    k += 1
    for i in ch:
        if i == 'L':
            x -= 1
        elif i == 'R':
            x += 1
        elif i == 'U':
            y += 1
        elif i == 'D':
            y -= 1
        co[0][k] = x
        co[1][k] = y
        k += 1
    for i in range(k - 3):
        for j in range(i + 3, k):
            dx = abs(co[0][i] - co[0][j])
            dy = abs(co[1][i] - co[1][j])
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                flag = False
                break
        if not flag:
            break
    if flag:
        print("OK")
    else:
        print("BUG")

if __name__ == "__main__":
    main()

