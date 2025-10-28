
from collections import defaultdict
import heapq

NUM = int(1e5 + 2)

def main():
    N = int(input())
    map = defaultdict(int)
    nums = []
    for i, tmp in enumerate(map(int, input().split())):
        nums.append(tmp)
        map[tmp] = i
    nums.sort()
    bin = 0
    diff = 0
    for num in nums:
        idx = map[num]
        if (bin % 2) != (idx % 2):
            diff += 1
        bin += 1
        bin %= 2
    ans = diff // 2
    print(ans)

if __name__ == "__main__":
    main()

