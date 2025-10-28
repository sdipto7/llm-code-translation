
import sys

def main():
    data = sys.stdin.read().split()
    N = int(data[0])
    x = int(data[1])
    srimeList = list(map(int, data[2:2+N]))
    
    costList = []
    for i in range(N):
        costList.append([0] * N)
    
    for i in range(N):
        costList[i][0] = srimeList[i]
        for castNum in range(1, N):
            index = (i - castNum + N) % N
            costList[i][castNum] = min(costList[i][castNum-1], srimeList[index])
    
    result = []
    for i in range(N):
        j = i
        total_sum = 0
        for k in range(N):
            total_sum += costList[k][j]
        result.append(i * x + total_sum)
    
    print(min(result))

if __name__ == "__main__":
    main()

