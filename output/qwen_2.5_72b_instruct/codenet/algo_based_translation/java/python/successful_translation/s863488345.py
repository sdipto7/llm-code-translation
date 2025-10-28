
import sys

class Main:
    @staticmethod
    def main():
        input = sys.stdin.read().split()
        index = 0
        mapNum = int(input[index])
        index += 1

        for i in range(mapNum):
            if 1 <= i < mapNum:
                print()
            h = int(input[index])
            w = int(input[index + 1])
            index += 2

            battleTown = [['' for _ in range(w)] for _ in range(h)]

            for j in range(h):
                c = input[index]
                index += 1
                for k in range(w):
                    battleTown[j][k] = c[k]
                    if c[k] in ['^', 'v', '<', '>']:
                        x = j
                        y = k

            bomberActNum = int(input[index])
            bomberAct = input[index + 1]
            index += 2

            for l in range(bomberActNum):
                if bomberAct[l] == 'U':
                    battleTown[x][y] = '^'
                    if x - 1 >= 0 and battleTown[x - 1][y] == '.':
                        battleTown[x - 1][y] = '^'
                        battleTown[x][y] = '.'
                        x -= 1
                elif bomberAct[l] == 'D':
                    battleTown[x][y] = 'v'
                    if x + 1 < h and battleTown[x + 1][y] == '.':
                        battleTown[x + 1][y] = 'v'
                        battleTown[x][y] = '.'
                        x += 1
                elif bomberAct[l] == 'L':
                    battleTown[x][y] = '<'
                    if y - 1 >= 0 and battleTown[x][y - 1] == '.':
                        battleTown[x][y - 1] = '<'
                        battleTown[x][y] = '.'
                        y -= 1
                elif bomberAct[l] == 'R':
                    battleTown[x][y] = '>'
                    if y + 1 < w and battleTown[x][y + 1] == '.':
                        battleTown[x][y + 1] = '>'
                        battleTown[x][y] = '.'
                        y += 1
                elif bomberAct[l] == 'S':
                    xOfBomber = x
                    yOfBomber = y
                    Main.moveBomber(battleTown, xOfBomber, yOfBomber, h, w)

            for s in range(h):
                for k in range(w):
                    print(battleTown[s][k], end='')
                print()

    @staticmethod
    def moveBomber(battleTown, a, b, h, w):
        if 0 <= a <= h and 0 <= b <= w:
            if battleTown[a][b] == '^':
                for i in range(a - 1, -1, -1):
                    if battleTown[i][b] == '*':
                        battleTown[i][b] = '.'
                        return
                    elif battleTown[i][b] == '#':
                        return
            elif battleTown[a][b] == 'v':
                for i in range(a + 1, h):
                    if battleTown[i][b] == '*':
                        battleTown[i][b] = '.'
                        return
                    elif battleTown[i][b] == '#':
                        return
            elif battleTown[a][b] == '<':
                for i in range(b - 1, -1, -1):
                    if battleTown[a][i] == '*':
                        battleTown[a][i] = '.'
                        return
                    elif battleTown[a][i] == '#':
                        return
            elif battleTown[a][b] == '>':
                for i in range(b + 1, w):
                    if battleTown[a][i] == '*':
                        battleTown[a][i] = '.'
                        return
                    elif battleTown[a][i] == '#':
                        return

if __name__ == "__main__":
    Main.main()

