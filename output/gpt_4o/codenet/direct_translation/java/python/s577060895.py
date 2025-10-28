
import math

n = int(input().strip())

sqrt = math.sqrt(n)
near_num = math.floor(sqrt)

ans = int(math.pow(near_num, 2))

print(ans)

