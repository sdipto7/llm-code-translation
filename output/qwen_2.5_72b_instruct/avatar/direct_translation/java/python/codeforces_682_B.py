import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
list = [int(x) for x in data[1:]]
list.sort()
c = 1
for i in range(n):
    if list[i] >= c:
        c += 1
print(c)
