
def main():
    N = int(input())
    x = int(input())
    srimeList = list(map(int, input().split()))
    costList = [[0]*N for _ in range(N)]
    for i in range(N):
        costList[i][0] = srimeList[i]
        for castNum in range(1, N):
            costList[i][castNum] = min(costList[i][castNum-1], srimeList[(i-castNum+N) % N])
    result = []
    for i in range(N):
        sum_val = sum(costArray[i] for costArray in costList)
        result.append(i*x + sum_val)
    print(min(result))

if __name__ == "__main__":
    main()

