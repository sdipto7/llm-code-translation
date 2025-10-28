
import sys
from queue import PriorityQueue

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    map = {}
    nums = PriorityQueue()
    
    index = 1
    for i in range(N):
        tmp = int(data[index])
        nums.put(tmp)
        map[tmp] = i
        index += 1
    
    bin = 0
    diff = 0
    
    while not nums.empty():
        num = nums.get()
        idx = map[num]
        if (bin % 2) != (idx % 2):
            diff += 1
        bin += 1
        bin %= 2
    
    ans = diff // 2
    print(ans)

if __name__ == "__main__":
    main()

