
import sys
n = int(sys.stdin.readline())
cnt = [0] * 21
for _ in range(n):
    cnt[int(sys.stdin.readline()) + 10] += 1
res = sum(cnt[i] * cnt[20 - i] for i in range(10))
res += cnt[10] * (cnt[10] - 1) // 2
print(res)

