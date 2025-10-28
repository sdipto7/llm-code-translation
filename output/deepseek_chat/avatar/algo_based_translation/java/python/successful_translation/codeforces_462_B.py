
import sys

class c462b:
    def __init__(self):
        self.left = 0
        
    def __lt__(self, other):
        return self.left < other.left

def main():
    data = sys.stdin.readline().split()
    n = int(data[0])
    k = int(data[1])
    s = sys.stdin.readline().strip()
    
    cards = [c462b() for _ in range(26)]
    
    for char in s:
        idx = ord(char) - ord('A')
        cards[idx].left += 1
    
    ans = 0
    i = 0
    while i < k:
        cards.sort()
        change = min(cards[-1].left, k - i)
        ans += change * change
        cards[-1].left -= change
        i += change
    
    print(ans)

if __name__ == "__main__":
    main()

