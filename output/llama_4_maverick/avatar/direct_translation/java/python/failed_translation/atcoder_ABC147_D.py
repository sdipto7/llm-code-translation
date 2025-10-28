
import sys
input = sys.stdin.readline
n = int(input())
div = 10 ** 9 + 7
A = [int(input()) for _ in range(n)]
ans = 0
for i in range(60):
    count1 = sum(1 for j in range(n) if (A[j] >> i) & 1)
    a = count1 * (n - count1)
    for _ in range(i):
        a = (a << 1) % div
    ans += a
    ans %= div
print(ans)

