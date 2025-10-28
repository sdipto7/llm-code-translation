
import sys
input = sys.stdin.read
data = input().split()

n = int(data[0])
cnt = [0] * 21

for i in range(n):
    cnt[int(data[i + 1]) + 10] += 1

res = 0
for i in range(10):
    res += cnt[i] * cnt[20 - i]

res += (cnt[10] * (cnt[10] - 1)) // 2

print(res)

