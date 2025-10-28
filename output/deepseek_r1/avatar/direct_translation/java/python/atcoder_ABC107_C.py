
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
k = data[1]
s = data[2:2+n]

ans = 10**18

if k == 1:
    ans = min(abs(x) for x in s)
elif n != k:
    for i in range(n - k + 1):
        min_val = s[i]
        max_val = s[i + k - 1]
        if min_val < 0 and max_val > 0:
            temp = min(2 * (-min_val) + max_val, (-min_val) + 2 * max_val)
        else:
            temp = max(abs(min_val), abs(max_val))
        ans = min(ans, temp)
else:
    min_val = s[0]
    max_val = s[-1]
    if min_val < 0 and max_val > 0:
        ans = min(2 * (-min_val) + max_val, (-min_val) + 2 * max_val)
    else:
        ans = max(abs(min_val), abs(max_val))

print(ans)

