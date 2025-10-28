
import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
array = list(map(int, data[1:]))
array.sort()
head = len(array) - 2
res = 0
for i in range(n):
    res += array[head]
    head -= 2
print(res)

