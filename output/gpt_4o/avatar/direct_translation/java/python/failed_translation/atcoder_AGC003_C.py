
import heapq

NUM = int(1e5 + 2)

def main():
    sc = list(map(int, input().split()))
    N = sc[0]
    nums = []
    map = {}
    for i in range(1, N + 1):
        tmp = sc[i]
        heapq.heappush(nums, tmp)
        map[tmp] = i - 1
    bin = 0
    diff = 0
    while nums:
        num = heapq.heappop(nums)
        idx = map[num]
        if (bin % 2) != (idx % 2):
            diff += 1
        bin += 1
        bin %= 2
    ans = (diff // 2)
    print(ans)

main()

