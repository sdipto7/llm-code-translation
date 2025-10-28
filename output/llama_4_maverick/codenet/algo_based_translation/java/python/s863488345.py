
class Main:
    def __init__(self):
        pass

    def move_bomber(self, battle_town, a, b, h, w):
        direction = battle_town[a][b]
        if direction == '^':
            for i in range(a - 1, -1, -1):
                if battle_town[i][b] == '*':
                    battle_town[i][b] = '.'
                    break
                elif battle_town[i][b] == '#':
                    break
        elif direction == 'v':
            for i in range(a + 1, h):
                if battle_town[i][b] == '*':
                    battle_town[i][b] = '.'
                    break
                elif battle_town[i][b] == '#':
                    break
        elif direction == '<':
            for i in range(b - 1, -1, -1):
                if battle_town[a][i] == '*':
                    battle_town[a][i] = '.'
                    break
                elif battle_town[a][i] == '#':
                    break
        elif direction == '>':
            for i in range(b + 1, w):
                if battle_town[a][i] == '*':
                    battle_town[a][i] = '.'
                    break
                elif battle_town[a][i] == '#':
                    break

    def main(self):
        map_num = int(input())
        for _ in range(map_num):
            if _ > 0:
                print()
            h, w = map(int, input().split())
            battle_town = []
            x, y = 0, 0
            for i in range(h):
                row = list(input().strip())
                battle_town.append(row)
                for j in range(w):
                    if row[j] in ['^', 'v', '<', '>']:
                        x, y = i, j
            bomber_act_num = int(input())
            bomber_act = input().strip()
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
                    self.move_bomber(battle_town, x, y, h, w)
            for row in battle_town:
                print(''.join(row))

if __name__ == "__main__":
    main = Main()
    main.main()

