
import sys
import math

def main():
    n, k = map(int, sys.stdin.readline().split())
    s = sys.stdin.readline().strip()
    cards = [0] * 26
    for c in s:
        cards[ord(c) - ord('A')] += 1
    ans = 0
    for _ in range(k):
        cards.sort()
        change = min(cards[-1], k - _)
        ans += change * change
        cards[-1] -= change
        _ += change - 1
    print(ans)

if __name__ == "__main__":
    main()

