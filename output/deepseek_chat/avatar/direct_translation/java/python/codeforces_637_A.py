
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline())
    ara = list(map(int, sys.stdin.readline().split()))
    count = defaultdict(int)
    for num in ara:
        count[num] += 1
    max_count = max(count.values())
    seen = defaultdict(int)
    for num in ara:
        seen[num] += 1
        if seen[num] == max_count:
            print(num)
            break

if __name__ == "__main__":
    main()

