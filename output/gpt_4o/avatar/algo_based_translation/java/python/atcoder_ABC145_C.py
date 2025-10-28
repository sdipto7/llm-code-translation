
import math

def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    pos = []
    
    index = 1
    for i in range(N):
        x = int(data[index])
        y = int(data[index + 1])
        pos.append((x, y))
        index += 2
    
    sum_dist = 0.0
    
    for i in range(N):
        for j in range(N):
            if i == j:
                continue
            sum_dist += dist(pos[i][0], pos[i][1], pos[j][0], pos[j][1])
    
    print(sum_dist / N)

if __name__ == "__main__":
    main()

