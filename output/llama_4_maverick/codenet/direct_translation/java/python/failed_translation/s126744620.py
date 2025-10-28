
from collections import Counter

n, k = map(int, input().split())
a = list(map(int, input().split())) if n == 1 else list(map(int, ' '.join([input() for _ in range(n)]).split()))
x = [0] * 200010
for i in a:
    x[i - 1] += 1
x.sort()
ans = sum(x[:200010 - k])
print(ans)

