
import math

def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)

def main():
    n = int(input())
    pos = [list(map(int, input().split())) for _ in range(n)]
    total = 0.0
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            total += dist(pos[i][0], pos[i][1], pos[j][0], pos[j][1])
    print(total / n)

if __name__ == "__main__":
    main()

