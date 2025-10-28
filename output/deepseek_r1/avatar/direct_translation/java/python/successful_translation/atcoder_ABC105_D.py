
from collections import defaultdict

n, m = map(int, input().split())
a = list(map(int, input().split()))
dp = defaultdict(int)
ans = 0
base = 0

for num in a:
    base = (base - (num % m) + m) % m
    key = (base + num) % m
    dp[key] += 1
    ans += dp.get(base, 0)

print(ans)

