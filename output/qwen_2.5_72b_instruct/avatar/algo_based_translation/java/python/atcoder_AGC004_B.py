def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    N = int(data[0])
    x = int(data[1])
    srimeList = []

    index = 2
    for i in range(N):
        srimeList.append(int(data[index]))
        index += 1

    costList = []
    for i in range(N):
        costList.append([0] * N)

    for i in range(N):
        costList[i][0] = srimeList[i]
        for castNum in range(1, N):
            costList[i][castNum] = min(costList[i][castNum - 1], srimeList[(i - castNum + N) % N])

    result = []
    for i in range(N):
        j = i
        total_sum = i * x
        for costArray in costList:
            total_sum += costArray[j]
        result.append(total_sum)

    print(min(result))

if __name__ == "__main__":
    main()
