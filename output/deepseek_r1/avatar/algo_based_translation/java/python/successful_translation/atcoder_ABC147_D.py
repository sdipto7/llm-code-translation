
MOD = 10**9 + 7

n = int(input())
A = list(map(int, input().split()))
ans = 0

for i in range(60):
    count1 = sum(1 for num in A if (num >> i) & 1)
    term = count1 * (n - count1)
    term = term * pow(2, i, MOD)
    ans = (ans + term) % MOD

print(ans % MOD)

