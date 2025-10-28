
def move_bomber(a, b):
    if 0 <= a < h and 0 <= b < w:
        if battle_town[a][b] == '^':
            for i in range(a - 1, -1, -1):
                if a <= 0:
                    return
                if battle_town[a - 1][b] == '*':
                    battle_town[a - 1][b] = '.'
                    return
                elif battle_town[a - 1][b] == '#':
                    return
                else:
                    a -= 1
                    if a == 0:
                        return
        if battle_town[a][b] == 'v':
            for i in range(a + 1, h):
                if battle_town[a + 1][b] == '*':
                    battle_town[a + 1][b] = '.'
                    return
                elif battle_town[a + 1][b] == '#':
                    return
                else:
                    a += 1
                    if a == h:
                        return
        if battle_town[a][b] == '<':
            for i in range(b - 1, -1, -1):
                if battle_town[a][b - 1] == '*':
                    battle_town[a][b - 1] = '.'
                    return
                elif battle_town[a][b - 1] == '#':
                    return
                else:
                    b -= 1
                    if b == 0:
                        return
        if battle_town[a][b] == '>':
            for i in range(b + 1, w):
                if battle_town[a][b + 1] == '*':
                    battle_town[a][b + 1] = '.'
                    return
                elif battle_town[a][b + 1] == '#':
                    return
                else:
                    b += 1
                    if b == w:
                        return

import sys

input = sys.stdin.readline

map_num = int(input())

for _ in range(map_num):
    if 1 <= _ < map_num:
        print()
    h, w = map(int, input().split())

    battle_town = [list(input().strip()) for _ in range(h)]

    x, y = -1, -1
    for j in range(h):
        for k in range(w):
            if battle_town[j][k] in '^v<>':
                x, y = j, k

    bomber_act_num = int(input())
    bomber_act = input().strip()

    if 0 <= x < h and 0 <= y < w:
        for l in range(bomber_act_num):
            if bomber_act[l] == 'U':
                battle_town[x][y] = '^'
                if x - 1 >= 0 and battle_town[x - 1][y] == '.':
                    battle_town[x - 1][y] = '^'
                    battle_town[x][y] = '.'
                    x -= 1
            if bomber_act[l] == 'D':
                battle_town[x][y] = 'v'
                if x + 1 < h and battle_town[x + 1][y] == '.':
                    battle_town[x + 1][y] = 'v'
                    battle_town[x][y] = '.'
                    x += 1
            if bomber_act[l] == 'L':
                battle_town[x][y] = '<'
                if y - 1 >= 0 and battle_town[x][y - 1] == '.':
                    battle_town[x][y - 1] = '<'
                    battle_town[x][y] = '.'
                    y -= 1
            if bomber_act[l] == 'R':
                battle_town[x][y] = '>'
                if y + 1 < w and battle_town[x][y + 1] == '.':
                    battle_town[x][y + 1] = '>'
                    battle_town[x][y] = '.'
                    y += 1
            if bomber_act[l] == 'S':
                x_of_bomber = x
                y_of_bomber = y
                move_bomber(x_of_bomber, y_of_bomber)

        for s in range(h):
            print(''.join(battle_town[s]))

