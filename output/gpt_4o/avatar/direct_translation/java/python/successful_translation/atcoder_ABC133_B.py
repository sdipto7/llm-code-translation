
import math

def main():
    sc = input().split()
    N = int(sc[0])
    D = int(sc[1])
    vectors = []
    for _ in range(N):
        vectors.append(list(map(int, input().split())))
    answer = 0
    for i in range(N - 1):
        for j in range(i + 1, N):
            dist = 0
            for d in range(D):
                x = vectors[i][d] - vectors[j][d]
                dist += x * x
            sq = math.sqrt(dist)
            answer += (abs(sq - math.floor(sq)) < 0.001)
    print(answer)

main()

