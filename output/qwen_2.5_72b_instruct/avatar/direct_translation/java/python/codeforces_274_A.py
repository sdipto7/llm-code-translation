
import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
k = int(data[1])
arr = list(map(int, data[2:]))
arr.sort()
count = 0
s = set()
for i in range(n):
    if arr[i] % k != 0:
        count += 1
        s.add(arr[i])
    elif arr[i] // k not in s:
        count += 1
        s.add(arr[i])
print(count)

