import math
n = int(input())
m = int(input())
gcd = math.gcd(n, m)
s = input()
t = input()
result = next((-1 for k in range(gcd) if s[k * n // gcd] != t[k * m // gcd]), n * m // gcd)
print(result)
