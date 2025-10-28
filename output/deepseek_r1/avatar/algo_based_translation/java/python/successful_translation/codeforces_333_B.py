
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
m = data[ptr]
ptr += 1

banned_rows = set()
banned_cols = set()

for _ in range(m):
    r = data[ptr]
    ptr += 1
    c = data[ptr]
    ptr += 1
    if r > 1 and r < n:
        banned_rows.add(r)
    if c > 1 and c < n:
        banned_cols.add(c)

answer = (n - 2) * 2
answer -= len(banned_rows)
answer -= len(banned_cols)

if n % 2 != 0:
    mid = (n + 1) // 2
    if mid not in banned_rows and mid not in banned_cols:
        answer -= 1

print(answer)

