n, m = map(int, input().split())
banned_rows = set()
banned_cols = set()

for _ in range(m):
    r, c = map(int, input().split())
    if 1 < r < n:
        banned_rows.add(r)
    if 1 < c < n:
        banned_cols.add(c)

answer = (n - 2) * 2
answer -= len(banned_rows)
answer -= len(banned_cols)

if n % 2 != 0:
    mid = (n + 1) // 2
    if mid not in banned_rows and mid not in banned_cols:
        answer -= 1

print(answer)
