import sys
input = sys.stdin.read
data = input().split()
t = int(data[0])
count = [0] * (t + 1)
for i in range(1, t + 1):
    count[int(data[i])] += 1
for i in range(1, t + 1):
    print(count[i])
