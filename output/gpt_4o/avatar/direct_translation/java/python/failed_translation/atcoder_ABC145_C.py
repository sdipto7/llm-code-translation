
import math

def main():
    scanner = Scanner()
    N = scanner.nextInt()
    pos = [[0] * 2 for _ in range(N)]
    for i in range(N):
        pos[i][0] = scanner.nextInt()
        pos[i][1] = scanner.nextInt()
    sum = 0
    for i in range(N):
        for j in range(N):
            if i == j:
                continue
            sum += dist(pos[i][0], pos[i][1], pos[j][0], pos[j][1])
    print(sum / N)

def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)

class Scanner:
    def __init__(self):
        self.data = input().split()
        self.index = 0

    def nextInt(self):
        value = int(self.data[self.index])
        self.index += 1
        return value

main()

