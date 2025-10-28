
import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
levels = int(data[1])
sum = 0
sum2 = 0
sum3 = 0
arr = [0] * levels
count = 0
index = 2
for i in range(levels):
    arr[i] = int(data[index])
    index += 1
level2 = int(data[index])
level3 = levels + level2
arr2 = [0] * level3
for i in range(len(arr)):
    arr2[i] = arr[i]
for i in range(len(arr), level3):
    arr2[i] = int(data[index])
    index += 1
arr3 = [0] * n
j = 0
for i in range(n):
    arr3[i] = j + 1
    j += 1
for i in range(n):
    for x in range(len(arr2)):
        if arr3[i] == arr2[x]:
            count += 1
            break
if count == n:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")

