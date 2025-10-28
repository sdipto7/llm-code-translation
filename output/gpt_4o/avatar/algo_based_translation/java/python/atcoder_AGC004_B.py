
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    x = int(data[1])
    
    srimeList = []
    for i in range(N):
        srimeList.append(int(data[2 + i]))
    
    costList = []
    for i in range(N):
        costList.append([0] * N)
    
    for i in range(N):
        costList[i][0] = srimeList[i]
        for castNum in range(1, N):
            costList[i][castNum] = min(costList[i][castNum - 1], srimeList[(i - castNum + N) % N])
    
    result = []
    for i in range(N):
        total_cost = i * x + sum(costArray[i] for costArray in costList)
        result.append(total_cost)
    
    print(min(result))

if __name__ == "__main__":
    main()

