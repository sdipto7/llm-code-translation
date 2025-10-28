
import sys

def main():
    data = sys.stdin.read().splitlines()
    index = 0
    mapNum = int(data[index]); index += 1
    
    for i in range(mapNum):
        if i > 0:
            print()
        h, w = map(int, data[index].split()); index += 1
        battleTown = []
        x, y = -1, -1
        
        for j in range(h):
            line = data[index]; index += 1
            row = list(line)
            battleTown.append(row)
            for k in range(w):
                if row[k] in ['^', 'v', '<', '>']:
                    x, y = j, k
        
        bomberActNum = int(data[index]); index += 1
        bomberAct = list(data[index]); index += 1
        
        if 0 <= x < h and 0 <= y < w:
            for l in range(bomberActNum):
                action = bomberAct[l]
                if action == 'U':
                    battleTown[x][y] = '^'
                    if x - 1 >= 0 and battleTown[x-1][y] == '.':
                        battleTown[x-1][y] = '^'
                        battleTown[x][y] = '.'
                        x -= 1
                elif action == 'D':
                    battleTown[x][y] = 'v'
                    if x + 1 < h and battleTown[x+1][y] == '.':
                        battleTown[x+1][y] = 'v'
                        battleTown[x][y] = '.'
                        x += 1
                elif action == 'L':
                    battleTown[x][y] = '<'
                    if y - 1 >= 0 and battleTown[x][y-1] == '.':
                        battleTown[x][y-1] = '<'
                        battleTown[x][y] = '.'
                        y -= 1
                elif action == 'R':
                    battleTown[x][y] = '>'
                    if y + 1 < w and battleTown[x][y+1] == '.':
                        battleTown[x][y+1] = '>'
                        battleTown[x][y] = '.'
                        y += 1
                elif action == 'S':
                    moveBomber(battleTown, x, y, h, w)
            
            for s in range(h):
                print(''.join(battleTown[s]))

def moveBomber(battleTown, a, b, h, w):
    if not (0 <= a < h and 0 <= b < w):
        return
    
    tank_dir = battleTown[a][b]
    
    if tank_dir == '^':
        pos = a - 1
        while pos >= 0:
            if battleTown[pos][b] == '*':
                battleTown[pos][b] = '.'
                return
            elif battleTown[pos][b] == '#':
                return
            pos -= 1
    elif tank_dir == 'v':
        pos = a + 1
        while pos < h:
            if battleTown[pos][b] == '*':
                battleTown[pos][b] = '.'
                return
            elif battleTown[pos][b] == '#':
                return
            pos += 1
    elif tank_dir == '<':
        pos = b - 1
        while pos >= 0:
            if battleTown[a][pos] == '*':
                battleTown[a][pos] = '.'
                return
            elif battleTown[a][pos] == '#':
                return
            pos -= 1
    elif tank_dir == '>':
        pos = b + 1
        while pos < w:
            if battleTown[a][pos] == '*':
                battleTown[a][pos] = '.'
                return
            elif battleTown[a][pos] == '#':
                return
            pos += 1

if __name__ == '__main__':
    main()

