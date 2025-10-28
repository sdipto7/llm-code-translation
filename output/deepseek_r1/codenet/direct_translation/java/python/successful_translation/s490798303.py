
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
k = data[ptr]
ptr += 1

people = {}

for _ in range(k):
    d = data[ptr]
    ptr += 1
    for _ in range(d):
        person = data[ptr]
        ptr += 1
        if person not in people:
            people[person] = []
        people[person].append(d)

count = 0
for i in range(1, n + 1):
    if i not in people:
        count += 1

print(count)

