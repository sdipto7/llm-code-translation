n, k = map(int, input().split())
s = input().strip()

counts = [0] * 26
for c in s:
    counts[ord(c) - ord('A')] += 1

ans = 0
taken = 0

while taken < k:
    counts.sort(reverse=True)
    possible = min(counts[0], k - taken)
    ans += possible ** 2
    counts[0] -= possible
    taken += possible

print(ans)
