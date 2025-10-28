
import math

def main():
    import sys
    input = sys.stdin.read
    N = int(input())
    pos = [tuple(map(int, input().split())) for _ in range(N)]
    sum_dist = 0
    for i in range(N):
        for j in range(N):
            if i == j:
                continue
            sum_dist += math.sqrt((pos[i][0] - pos[j][0])**2 + (pos[i][1] - pos[j][1])**2)
    print(sum_dist / N)

if __name__ == "__main__":
    main()

