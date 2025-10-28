
import math

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    N = int(data[index])
    index += 1
    D = int(data[index])
    index += 1
    
    vectors = []
    for i in range(N):
        vector = []
        for j in range(D):
            vector.append(int(data[index]))
            index += 1
        vectors.append(vector)
    
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

