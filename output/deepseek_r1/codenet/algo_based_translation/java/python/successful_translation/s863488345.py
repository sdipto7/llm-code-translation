
import sys

map_num = int(sys.stdin.readline())
for map_idx in range(map_num):
    if map_idx > 0:
        print()
    h, w = map(int, sys.stdin.readline().split())
    battle_town = []
    x, y = -1, -1
    for _ in range(h):
        line = list(sys.stdin.readline().strip())
        battle_town.append(line)
        for col_idx, char in enumerate(line):
            if char in '^v<>':
                x, y = _, col_idx
    bomber_act_num = int(sys.stdin.readline())
    bomber_act = sys.stdin.readline().strip()
    
    def move_bomber(a, b):
        direction = battle_town[a][b]
        if direction == '^':
            current_row = a - 1
            while current_row >= 0:
                if battle_town[current_row][b] == '*':
                    battle_town[current_row][b] = '.'
                    break
                elif battle_town[current_row][b] == '#':
                    break
                current_row -= 1
        elif direction == 'v':
            current_row = a + 1
            while current_row < h:
                if battle_town[current_row][b] == '*':
                    battle_town[current_row][b] = '.'
                    break
                elif battle_town[current_row][b] == '#':
                    break
                current_row += 1
        elif direction == '<':
            current_col = b - 1
            while current_col >= 0:
                if battle_town[a][current_col] == '*':
                    battle_town[a][current_col] = '.'
                    break
                elif battle_town[a][current_col] == '#':
                    break
                current_col -= 1
        elif direction == '>':
            current_col = b + 1
            while current_col < w:
                if battle_town[a][current_col] == '*':
                    battle_town[a][current_col] = '.'
                    break
                elif battle_town[a][current_col] == '#':
                    break
                current_col += 1
    
    for act in bomber_act:
        if act == 'U':
            battle_town[x][y] = '^'
            if x - 1 >= 0 and battle_town[x-1][y] == '.':
                battle_town[x-1][y] = '^'
                battle_town[x][y] = '.'
                x -= 1
        elif act == 'D':
            battle_town[x][y] = 'v'
            if x + 1 < h and battle_town[x+1][y] == '.':
                battle_town[x+1][y] = 'v'
                battle_town[x][y] = '.'
                x += 1
        elif act == 'L':
            battle_town[x][y] = '<'
            if y - 1 >= 0 and battle_town[x][y-1] == '.':
                battle_town[x][y-1] = '<'
                battle_town[x][y] = '.'
                y -= 1
        elif act == 'R':
            battle_town[x][y] = '>'
            if y + 1 < w and battle_town[x][y+1] == '.':
                battle_town[x][y+1] = '>'
                battle_town[x][y] = '.'
                y += 1
        elif act == 'S':
            move_bomber(x, y)
    
    for row in battle_town:
        print(''.join(row))

