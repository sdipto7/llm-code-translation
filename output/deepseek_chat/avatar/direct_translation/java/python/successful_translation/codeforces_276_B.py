
import sys
from collections import defaultdict

def main():
    str = sys.stdin.readline().strip()
    map = defaultdict(int)
    oddCount = 0
    for ch in str:
        map[ch] += 1
    for key in map:
        if map[key] % 2 != 0:
            oddCount += 1
    if oddCount <= 1 or oddCount % 2 != 0:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()

