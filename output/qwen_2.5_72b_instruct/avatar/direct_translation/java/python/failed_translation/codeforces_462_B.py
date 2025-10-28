import sys
import heapq

n, k = map(int, sys.stdin.readline().split())
cards = [0] * 26
s = sys.stdin.readline().strip()
for char in s:
    cards[ord(char) - ord('A')] += 1

ans = 0
for _ in range(k):
    cards.sort()
    change = min(cards[25], k - _)
    ans += change * change
    cards[25] -= change

print(ans)
