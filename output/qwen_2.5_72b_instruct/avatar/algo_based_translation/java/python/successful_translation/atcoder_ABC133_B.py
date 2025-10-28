
import math
import sys

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    D = int(data[1])
    index = 2
    
    vectors = [[0] * D for _ in range(N)]
    for i in range(N):
        for j in range(D):
            vectors[i][j] = int(data[index])
            index += 1
    
    answer = 0
    for i in range(N - 1):
        for j in range(i + 1, N):
            dist = 0
            for d in range(D):
                x = vectors[i][d] - vectors[j][d]
                dist += x * x
            sq = math.sqrt(dist)
            if abs(sq - math.floor(sq)) < 0.001:
                answer += 1
    
    print(answer)

if __name__ == "__main__":
    main()

