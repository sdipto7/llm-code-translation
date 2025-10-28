
import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
k = int(data[1])

map = {}

index = 2
for i in range(k):
    d = int(data[index])
    index += 1
    for j in range(d):
        person = int(data[index])
        index += 1
        if person not in map:
            map[person] = []
        map[person].append(d)

count = 0
for i in range(1, n + 1):
    if i not in map:
        count += 1

print(count)

