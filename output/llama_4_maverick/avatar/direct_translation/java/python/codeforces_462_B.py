
import sys

class Card:
    def __init__(self):
        self.left = 0

    def __lt__(self, other):
        return self.left < other.left

def main():
    input = sys.stdin.readline
    n, k = map(int, input().split())
    cards = [Card() for _ in range(26)]
    s = input().strip()
    for c in s:
        cards[ord(c) - ord('A')].left += 1
    ans = 0
    for i in range(k):
        cards.sort()
        change = min(cards[-1].left, k - i)
        ans += change * change
        cards[-1].left -= change
        i += change - 1
    print(ans)

if __name__ == "__main__":
    main()

