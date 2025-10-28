
import sys
input = sys.stdin.read
data = input().split()

n = int(data[0])
a = int(data[1])
b = int(data[2])

list1 = list(map(int, data[3:3+a]))
list2 = list(map(int, data[3+a:3+a+b]))

for i in range(n):
    if i + 1 in list1:
        print(1, end=' ')
    else:
        print(2, end=' ')

