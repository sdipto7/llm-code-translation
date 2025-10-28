
import sys

def move_bomber(a, b):
    global h, w, battle_town
    if 0 <= a < h and 0 <= b < w:
        if battle_town[a][b] == '^':
            for i in range(a - 1, -1, -1):
                if a <= 0:
                    return
                if battle_town[a - 1][b] == '*':
                    battle_town[a - 1][b] = '.'
                    return
                if battle_town[a - 1][b] == '#':
                    return
                a -= 1
                if a == 0:
                    return

        if battle_town[a][b] == 'v':
            for i in range(a + 1, h):
                if battle_town[a + 1][b] == '*':
                    battle_town[a + 1][b] = '.'
                    return
                if battle_town[a + 1][b] == '#':
                    return
                a += 1
                if a == h:
                    return

        if battle_town[a][b] == '<':
            for i in range(b - 1, -1, -1):
                if battle_town[a][b - 1] == '*':
                    battle_town[a][b - 1] = '.'
                    return
                if battle_town[a][b - 1] == '#':
                    return
                b -= 1
                if b == 0:
                    return

        if battle_town[a][b] == '>':
            for i in range(b + 1, w):
                if battle_town[a][b + 1] == '*':
                    battle_town[a][b + 1] = '.'
                    return
                if battle_town[a][b + 1] == '#':
                    return
                b += 1
                if b == w:
                    return

def main():
    global h, w, battle_town
    input = sys.stdin.read
    data = input().split()
    index = 0

    map_num = int(data[index])
    index += 1

    for i in range(map_num):
        if 1 <= i < map_num:
            print()

        h = int(data[index])
        index += 1
        w = int(data[index])
        index += 1

        battle_town = [list(data[index + j]) for j in range(h)]
        index += h

        x = y = -1
        for j in range(h):
            for k in range(w):
                if battle_town[j][k] in ('^', 'v', '<', '>'):
                    x, y = j, k

        bomber_act_num = int(data[index])
        index += 1
        bomber_act = data[index]
        index += 1

        if 0 <= x < h and 0 <= y < w:
            for l in range(bomber_act_num):
                if bomber_act[l] == 'U':
                    battle_town[x][y] = '^'
                    if x - 1 >= 0 and battle_town[x - 1][y] == '.':
                        battle_town[x - 1][y] = '^'
                        battle_town[x][y] = '.'
                        x -= 1
                elif bomber_act[l] == 'D':
                    battle_town[x][y] = 'v'
                    if x + 1 < h and battle_town[x + 1][y] == '.':
                        battle_town[x + 1][y] = 'v'
                        battle_town[x][y] = '.'
                        x += 1
                elif bomber_act[l] == 'L':
                    battle_town[x][y] = '<'
                    if y - 1 >= 0 and battle_town[x][y - 1] == '.':
                        battle_town[x][y - 1] = '<'
                        battle_town[x][y] = '.'
                        y -= 1
                elif bomber_act[l] == 'R':
                    battle_town[x][y] = '>'
                    if y + 1 < w and battle_town[x][y + 1] == '.':
                        battle_town[x][y + 1] = '>'
                        battle_town[x][y] = '.'
                        y += 1
                elif bomber_act[l] == 'S':
                    move_bomber(x, y)

            for s in range(h):
                for k in range(w):
                    print(battle_town[s][k], end='')
                print()

if __name__ == "__main__":
    main()

