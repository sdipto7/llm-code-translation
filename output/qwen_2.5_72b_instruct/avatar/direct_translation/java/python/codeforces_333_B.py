
import sys
input = sys.stdin.read
data = input().split()

n = int(data[0])
m = int(data[1])
bannedRows = set()
bannedCols = set()

index = 2
for i in range(m):
    r = int(data[index])
    if r > 1 and r < n:
        bannedRows.add(r)
    c = int(data[index + 1])
    if c > 1 and c < n:
        bannedCols.add(c)
    index += 2

answer = (n - 2) * 2
answer -= len(bannedRows)
answer -= len(bannedCols)
if n % 2 != 0:
    mid = (n + 1) // 2
    if mid not in bannedRows and mid not in bannedCols:
        answer -= 1

print(answer)

