
import sys

def main():
    input = sys.stdin.readline
    N = int(input())
    x = int(input())
    srimeList = [int(input()) for _ in range(N)]
    costList = [[0] * N for _ in range(N)]
    for i in range(N):
        costList[i][0] = srimeList[i]
        for castNum in range(1, N):
            costList[i][castNum] = min(costList[i][castNum - 1], srimeList[(i - castNum + N) % N])
    result = []
    for i in range(N):
        total = sum(costList[j][i] for j in range(N))
        result.append(i * x + total)
    print(min(result))

if __name__ == "__main__":
    main()

