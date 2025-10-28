
import math

def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    pos = [[0, 0] for _ in range(N)]
    index = 1
    for i in range(N):
        pos[i][0] = int(data[index])
        pos[i][1] = int(data[index + 1])
        index += 2
    sum = 0
    for i in range(N):
        for j in range(N):
            if i == j:
                continue
            sum += dist(pos[i][0], pos[i][1], pos[j][0], pos[j][1])
    print(sum / N)

if __name__ == "__main__":
    main()

