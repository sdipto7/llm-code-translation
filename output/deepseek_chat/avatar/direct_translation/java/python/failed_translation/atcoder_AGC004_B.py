
import sys

def main():
    scan = sys.stdin
    N = int(scan.readline())
    x = int(scan.readline())
    srimeList = list(map(int, scan.readline().split()))
    costList = [[0] * N for _ in range(N)]
    for i in range(N):
        costList[i][0] = srimeList[i]
        for castNum in range(1, N):
            costList[i][castNum] = min(costList[i][castNum - 1], srimeList[(i - castNum + N) % N])
    result = []
    for i in range(N):
        j = i
        total = i * x + sum(costArray[j] for costArray in costList)
        result.append(total)
    print(min(result))

if __name__ == "__main__":
    main()

