import sys

input = sys.stdin.read
data = list(map(int, input().split()))
a = data[0]
b = data[1]
t = data[2]
time = 0
count = 0
while time < t + 0.5:
    count += b
    time += a
    if time > t + 0.5:
        count -= b
        break
print(count)
