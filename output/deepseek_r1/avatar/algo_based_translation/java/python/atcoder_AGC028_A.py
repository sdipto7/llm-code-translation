
import math

n, m = map(int, input().split())
s = input().strip()
t = input().strip()
gcd_value = math.gcd(n, m)

for k in range(gcd_value):
    s_idx = (k * n) // gcd_value
    t_idx = (k * m) // gcd_value
    if s[s_idx] != t[t_idx]:
        print(-1)
        exit()

lcm = (n * m) // gcd_value
print(lcm)

