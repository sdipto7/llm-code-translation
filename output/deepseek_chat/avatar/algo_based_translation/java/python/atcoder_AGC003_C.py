
import heapq
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    arr = list(map(int, data[1:1+N]))
    
    mapping = {}
    nums = []
    
    for i, val in enumerate(arr):
        heapq.heappush(nums, val)
        mapping[val] = i
    
    bin_var = 0
    diff = 0
    
    while nums:
        num = heapq.heappop(nums)
        idx = mapping[num]
        if bin_var % 2 != idx % 2:
            diff += 1
        bin_var += 1
        bin_var %= 2
    
    ans = diff // 2
    print(ans)

if __name__ == "__main__":
    main()

