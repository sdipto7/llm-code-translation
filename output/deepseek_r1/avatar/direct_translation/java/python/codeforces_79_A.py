x, y = map(int, input().split())
turn = 0

while True:
    if turn % 2 == 0:
        if x >= 2 and y >= 2:
            x -= 2
            y -= 2
        elif x >= 1 and y >= 12:
            x -= 1
            y -= 12
        elif y >= 22:
            y -= 22
        else:
            print("Hanako")
            break
    else:
        if y >= 22:
            y -= 22
        elif x >= 1 and y >= 12:
            x -= 1
            y -= 12
        elif x >= 2 and y >= 2:
            x -= 2
            y -= 2
        else:
            print("Ciel")
            break
    turn += 1
