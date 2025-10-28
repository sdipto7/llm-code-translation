
import math

def main():
    import sys
    data = sys.stdin.read().split()
    n = int(data[0])
    pos = []
    index = 1
    for i in range(n):
        x = int(data[index])
        y = int(data[index + 1])
        pos.append([x, y])
        index += 2
    
    total_sum = 0.0
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            total_sum += dist(pos[i][0], pos[i][1], pos[j][0], pos[j][1])
    
    print(total_sum / n)

def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)

if __name__ == "__main__":
    main()

