
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
m = data[ptr]
ptr += 1
a = [0] * (m + 1)
if m > 0:
    for i in range(1, m + 1):
        a[i] = data[ptr]
        ptr += 1

MOD = 10**9 + 7
cnt = [0] * (n + 1)
cnt[0] = 1
num = 1

if m > 0:
    if a[1] == 1:
        cnt[1] = 0
        if num < m:
            num += 1
    else:
        cnt[1] = 1
else:
    cnt[1] = 1

for i in range(2, n + 1):
    cnt[i] = (cnt[i-1] + cnt[i-2]) % MOD
    if m > 0:
        if num <= m and i == a[num]:
            cnt[i] = 0
            if num < m:
                num += 1

print(cnt[n])

