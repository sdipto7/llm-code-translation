
import sys

n, k = map(int, sys.stdin.readline().split())
s = sys.stdin.readline().strip()

counts = [0] * 26
for c in s:
    counts[ord(c) - ord('A')] += 1

ans = 0
i = 0
while i < k:
    counts.sort()
    max_count = counts[-1]
    remaining = k - i
    change = min(max_count, remaining)
    ans += change ** 2
    counts[-1] -= change
    i += change

print(ans)

