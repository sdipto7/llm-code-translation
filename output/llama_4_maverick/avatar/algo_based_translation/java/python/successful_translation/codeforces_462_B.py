
import sys

class Letter:
    def __init__(self):
        self.count = 0

    def __lt__(self, other):
        return self.count < other.count

def main():
    n, k = map(int, sys.stdin.readline().split())
    letters = [Letter() for _ in range(26)]
    s = sys.stdin.readline().strip()
    for char in s:
        letters[ord(char) - ord('A')].count += 1
    ans = 0
    i = 0
    while i < k:
        letters.sort()
        change = min(letters[-1].count, k - i)
        ans += change * change
        letters[-1].count -= change
        i += change
    print(ans)

if __name__ == "__main__":
    main()

