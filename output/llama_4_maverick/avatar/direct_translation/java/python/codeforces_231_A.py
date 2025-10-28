
import sys
t = int(sys.stdin.readline().strip())
count = 0
while t > 0:
    t -= 1
    a, b, c = map(int, sys.stdin.readline().strip().split())
    if (a == 1 and b == 1) or (a == 1 and c == 1) or (b == 1 and c == 1) or (a == 1 and b == 1 and c == 1):
        count += 1
print(count)

