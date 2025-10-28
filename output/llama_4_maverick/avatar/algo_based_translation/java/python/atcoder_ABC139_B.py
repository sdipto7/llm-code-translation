
import math
A, B = map(int, input().split())
result = (B - 1) // (A - 1)
remainder = (B - 1) % (A - 1)
if remainder != 0:
    result += 1
print(result)

