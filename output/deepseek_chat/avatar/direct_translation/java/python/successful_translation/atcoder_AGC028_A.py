
import math
n, m = map(int, input().split())
gcd = math.gcd(n, m)
s = input()
t = input()
print((lambda: next((-1 for k in range(gcd) if s[k * n // gcd] != t[k * m // gcd]), n * m // gcd))())

