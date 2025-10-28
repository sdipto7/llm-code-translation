
import heapq
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    map_index = {}
    nums = []
    
    for i in range(1, N + 1):
        tmp = int(data[i])
        heapq.heappush(nums, tmp)
        map_index[tmp] = i - 1
    
    bin = 0
    diff = 0
    
    while nums:
        num = heapq.heappop(nums)
        idx = map_index[num]
        if (bin % 2) != (idx % 2):
            diff += 1
        bin += 1
        bin %= 2
    
    ans = diff // 2
    print(ans)

if __name__ == "__main__":
    main()

