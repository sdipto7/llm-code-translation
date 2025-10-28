import sys

input = sys.stdin.read().split()
n = int(input[0])
d = int(input[1])
cnt = 0
index = 2

for i in range(n):
    x = int(input[index])
    y = int(input[index + 1])
    if (x*x + y*y) ** 0.5 <= d:
        cnt += 1
    index += 2

print(cnt)
