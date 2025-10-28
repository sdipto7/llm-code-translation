
import math

a, b = map(int, input().split())
found = False
for i in range(1, 100001):
    if math.floor(0.08 * i) == a and math.floor(0.1 * i) == b:
        print(i)
        found = True
        break
if not found:
    print(-1)

