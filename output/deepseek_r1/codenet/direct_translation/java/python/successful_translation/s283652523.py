MOD = 10**9 + 7
N = int(input())
A = list(map(int, input().split()))
sum_val = A[-1]
ans = 0
for i in range(N-2, -1, -1):
    ans = (ans + sum_val * A[i]) % MOD
    sum_val = (sum_val + A[i]) % MOD
print(ans)
