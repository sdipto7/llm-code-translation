
import sys
from collections import namedtuple

c462b = namedtuple('c462b', ['left'])

def main():
    input = sys.stdin.readline
    n, k = map(int, input().split())
    cards = [c462b(left=0) for _ in range(26)]
    s = input().strip()
    
    card_counts = [0] * 26
    for t in range(n):
        card_counts[ord(s[t]) - ord('A')] += 1
    
    cards = [c462b(left=card_counts[i]) for i in range(26)]
    
    ans = 0
    i = 0
    while i < k:
        cards.sort(key=lambda x: x.left)
        change = min(cards[25].left, k - i)
        ans += change * change
        cards[25] = c462b(left=cards[25].left - change)
        i += change
    
    print(ans)

if __name__ == "__main__":
    main()

