
import sys
n = int(sys.stdin.readline())
numbers = sorted([int(sys.stdin.readline()) for _ in range(n)])
c = 1
for num in numbers:
    if num >= c:
        c += 1
sys.stdout.write(str(c - 1) + '\n')

