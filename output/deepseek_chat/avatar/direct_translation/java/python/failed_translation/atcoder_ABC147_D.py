
import sys
import time

start_time = time.time()
n = int(sys.stdin.readline())
div = 10**9 + 7
A = [0] * n
ans = 0

for i in range(n):
    A[i] = int(sys.stdin.readline())

for i in range(60):
    a = 0
    count1 = 0
    for j in range(n):
        if (A[j] >> i) & 1:
            count1 += 1
    a += count1 * (n - count1)
    for j in range(i):
        a = (a << 1) % div
    ans += a
    ans %= div

print(ans)
end_time = time.time()

