
n, m = map(int, input().split())
MOD = 10**9 + 7
a = [0]
if m > 0:
    a += list(map(int, input().split()))
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

