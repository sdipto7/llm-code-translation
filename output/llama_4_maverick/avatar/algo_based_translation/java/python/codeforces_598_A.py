import math
q = int(input())
while q > 0:
    q -= 1
    n = int(input())
    x = int(math.log(n, 2)) + 1
    s = -2 ** x + 2 + n * (n + 1) // 2 - 2 ** x
    print(s)
