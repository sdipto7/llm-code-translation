
import math
from sys import stdin

n, m = map(int, stdin.readline().split())
gcd = math.gcd(n, m)
s = stdin.readline().strip()
t = stdin.readline().strip()

result = next((-1 for k in range(gcd) if s[k * n // gcd] != t[k * m // gcd]), (n * m) // gcd)
print(result)

