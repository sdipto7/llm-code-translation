
import sys
input = sys.stdin.read
data = input().split()

N = int(data[0])
x = int(data[1])
sweet = list(map(int, data[2:]))

sweet.sort()

num = 0
for i in range(N):
    if x - sweet[num] >= 0:
        x -= sweet[num]
        num += 1
    else:
        break

if num == N and x > 0:
    num -= 1

print(num)

