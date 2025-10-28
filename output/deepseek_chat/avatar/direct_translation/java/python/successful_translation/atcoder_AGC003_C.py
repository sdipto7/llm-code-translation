
import sys
import heapq

NUM = int(1e5 + 2)

def main():
    sc = sys.stdin
    N = int(sc.readline())
    map = {}
    nums = []
    for i in range(N):
        tmp = int(sc.readline())
        heapq.heappush(nums, tmp)
        map[tmp] = i
    bin = 0
    diff = 0
    while nums:
        num = heapq.heappop(nums)
        idx = map[num]
        if (bin % 2) != (idx % 2):
            diff += 1
        bin += 1
        bin %= 2
    ans = diff // 2
    print(ans)

if __name__ == "__main__":
    main()

