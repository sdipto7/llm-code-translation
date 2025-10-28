
import sys

input = sys.stdin.read().split()
x = int(input[0])
a = int(input[1])
y = int(input[2])
h = "NO"
if x == 5 or x == 7 or a == 5 or a == 7 or y == 5 or y == 7:
    if x + y + a == 17:
        h = "YES"
print(h)

