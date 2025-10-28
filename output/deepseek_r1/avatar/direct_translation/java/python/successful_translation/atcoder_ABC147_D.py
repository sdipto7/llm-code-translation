
n = int(input())
A = list(map(int, input().split()))
mod = 10**9 + 7
ans = 0
for i in range(60):
    cnt = 0
    mask = 1 << i
    for a in A:
        if a & mask:
            cnt += 1
    temp = cnt * (n - cnt) % mod
    temp = temp * pow(2, i, mod) % mod
    ans = (ans + temp) % mod
print(ans)

