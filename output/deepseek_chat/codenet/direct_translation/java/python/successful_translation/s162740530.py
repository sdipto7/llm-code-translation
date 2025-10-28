
n, m = map(int, input().split())
a = [0] * (m + 1)
cnt = [0] * (n + 1)
cnt[0] = 1
MOD = 1000000007

for i in range(1, len(a)):
    a[i] = int(input())

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

for i in range(2, len(cnt)):
    cnt[i] = (cnt[i - 2] + cnt[i - 1]) % MOD
    if m > 0:
        if i == a[num]:
            cnt[i] = 0
            if num < m:
                num += 1

print(cnt[n])

