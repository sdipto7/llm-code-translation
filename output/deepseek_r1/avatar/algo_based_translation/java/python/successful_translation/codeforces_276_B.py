
import sys
from collections import defaultdict

def main():
    s = sys.stdin.readline().strip()
    freq = defaultdict(int)
    for ch in s:
        freq[ch] += 1
    odd_count = sum(1 for cnt in freq.values() if cnt % 2 != 0)
    if odd_count <= 1 or odd_count % 2 != 0:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()

