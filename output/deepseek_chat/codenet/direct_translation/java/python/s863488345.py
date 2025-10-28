
import sys

def main():
    sc = sys.stdin
    map_num = int(sc.readline())
    
    for i in range(map_num):
        if 1 <= i < map_num:
            print()
        h, w = map(int, sc.readline().split())
        battle_town = [list(sc.readline().strip()) for _ in range(h)]
        
        x, y = -1, -1
        for j in range(h):
            for k in range(w):
                if battle_town[j][k] in ['^', 'v', '<', '>']:
                    x, y = j, k
        
        bomber_act_num = int(sc.readline())
        bomber_act = sc.readline().strip()
        
        for act in bomber_act:
            if act == 'U':
                battle_town[x][y] = '^'
                if x - 1 >= 0 and battle_town[x - 1][y] == '.':
                    battle_town[x - 1][y] = '^'
                    battle_town[x][y] = '.'
                    x -= 1
            elif act == 'D':
                battle_town[x][y] = 'v'
                if x + 1 < h and battle_town[x + 1][y] == '.':
                    battle_town[x + 1][y] = 'v'
                    battle_town[x][y] = '.'
                    x += 1
            elif act == 'L':
                battle_town[x][y] = '<'
                if y - 1 >= 0 and battle_town[x][y - 1] == '.':
                    battle_town[x][y - 1] = '<'
                    battle_town[x][y] = '.'
                    y -= 1
            elif act == 'R':
                battle_town[x][y] = '>'
                if y + 1 < w and battle_town[x][y + 1] == '.':
                    battle_town[x][y + 1] = '>'
                    battle_town[x][y] = '.'
                    y += 1
            elif act == 'S':
                x_of_bomber, y_of_bomber = x, y
                move_bomber(x_of_bomber, y_of_bomber, battle_town, h, w)
        
        for row in battle_town:
            print(''.join(row))

def move_bomber(a, b, battle_town, h, w):
    if 0 <= a < h and 0 <= b < w:
        if battle_town[a][b] == '^':
            for i in range(a - 1, -1, -1):
                if battle_town[i][b] == '*':
                    battle_town[i][b] = '.'
                    return
                elif battle_town[i][b] == '#':
                    return
        elif battle_town[a][b] == 'v':
            for i in range(a + 1, h):
                if battle_town[i][b] == '*':
                    battle_town[i][b] = '.'
                    return
                elif battle_town[i][b] == '#':
                    return
        elif battle_town[a][b] == '<':
            for i in range(b - 1, -1, -1):
                if battle_town[a][i] == '*':
                    battle_town[a][i] = '.'
                    return
                elif battle_town[a][i] == '#':
                    return
        elif battle_town[a][b] == '>':
            for i in range(b + 1, w):
                if battle_town[a][i] == '*':
                    battle_town[a][i] = '.'
                    return
                elif battle_town[a][i] == '#':
                    return

if __name__ == "__main__":
    main()

