
import sys

startTime = sys.currentTimeMillis()
n = int(input())
div = 10**9 + 7
A = list(map(int, input().split()))
ans = 0
for i in range(60):
    a = 0
    count1 = 0
    for j in range(n):
        if (A[j] >> i) & 1 == 1:
            count1 += 1
    a += count1 * (n - count1)
    for j in range(i):
        a = (a << 1) % div
    ans += a
    ans %= div
print(ans)
endTime = sys.currentTimeMillis()

