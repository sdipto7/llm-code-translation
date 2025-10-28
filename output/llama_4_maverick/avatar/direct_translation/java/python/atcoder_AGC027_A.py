
import sys
N = int(sys.stdin.readline())
x = int(sys.stdin.readline())
sweet = list(map(int, sys.stdin.readline().split()))
sweet.sort()
num = 0
for i in range(N):
    if x - sweet[num] >= 0:
        x = x - sweet[num]
        num += 1
    else:
        break
if num == N and x > 0:
    num -= 1
print(num)

