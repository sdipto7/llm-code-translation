
import sys

n = int(sys.stdin.readline())
tokens = sys.stdin.read().split()[:n]
cnt = [0] * 5

for s in tokens:
    if not s:
        continue
    c = s[0]
    if c == 'M':
        cnt[0] += 1
    elif c == 'A':
        cnt[1] += 1
    elif c == 'R':
        cnt[2] += 1
    elif c == 'C':
        cnt[3] += 1
    elif c == 'H':
        cnt[4] += 1

res = (
    cnt[0] * cnt[1] * cnt[2] +
    cnt[0] * cnt[1] * cnt[3] +
    cnt[0] * cnt[1] * cnt[4] +
    cnt[0] * cnt[2] * cnt[3] +
    cnt[0] * cnt[2] * cnt[4] +
    cnt[0] * cnt[3] * cnt[4] +
    cnt[1] * cnt[2] * cnt[3] +
    cnt[1] * cnt[2] * cnt[4] +
    cnt[1] * cnt[3] * cnt[4] +
    cnt[2] * cnt[3] * cnt[4]
)

print(res)

