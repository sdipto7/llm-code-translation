
import math

n, m = map(int, input().split())
g = math.gcd(n, m)
s = input().strip()
t = input().strip()

for k in range(g):
    if s[k * n // g] != t[k * m // g]:
        print(-1)
        exit()
print(n * m // g)

