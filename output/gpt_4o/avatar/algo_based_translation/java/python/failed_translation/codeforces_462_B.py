
import sys

class C462b:
    def __init__(self):
        self.left = 0

    def __lt__(self, other):
        return self.left < other.left

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    k = int(data[1])
    cards = [C462b() for _ in range(26)]
    
    s = data[2]
    for t in range(n):
        cards[ord(s[t]) - ord('A')].left += 1
    
    ans = 0
    i = 0
    while i < k:
        cards.sort(reverse=True)
        change = min(cards[0].left, k - i)
        ans += change * change
        cards[0].left -= change
        i += change
    
    print(ans)

if __name__ == "__main__":
    main()

