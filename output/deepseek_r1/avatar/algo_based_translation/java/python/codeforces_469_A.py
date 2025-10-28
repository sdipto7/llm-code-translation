
import sys

n = int(sys.stdin.readline())
p = int(sys.stdin.readline())
x = list(map(int, sys.stdin.readline().split()))
x = x[:p]
q = int(sys.stdin.readline())
y = list(map(int, sys.stdin.readline().split()))
y = y[:q]
merged = x + y
count = 0

for target in range(1, n + 1):
    for num in merged:
        if num == target:
            count += 1
            break

print("I become the guy." if count == n else "Oh, my keyboard!")

