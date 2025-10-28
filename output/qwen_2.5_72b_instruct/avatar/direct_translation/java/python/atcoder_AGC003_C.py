
import sys
from queue import PriorityQueue

NUM = int(1e5 + 2)
input = sys.stdin.read().split()
N = int(input[0])
map = {}
nums = PriorityQueue()
index = 1
for i in range(N):
    tmp = int(input[index])
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

