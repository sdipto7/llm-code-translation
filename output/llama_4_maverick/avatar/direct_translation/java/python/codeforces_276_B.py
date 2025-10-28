
import sys
from collections import defaultdict

def main():
    str = sys.stdin.readline().strip()
    map = defaultdict(int)
    oddCount = 0
    for ch in str:
        map[ch] += 1
    for value in map.values():
        if value % 2 != 0:
            oddCount += 1
    if oddCount <= 1 or oddCount % 2 != 0:
        sys.stdout.write("First\n")
    else:
        sys.stdout.write("Second\n")

if __name__ == "__main__":
    main()

