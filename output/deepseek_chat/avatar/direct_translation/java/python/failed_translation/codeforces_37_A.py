
import sys
from collections import defaultdict

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    map = defaultdict(int)
    index = 1
    for _ in range(n):
        val = int(data[index])
        map[val] += 1
        index += 1
    max_val = max(map.values())
    print(f"{max_val}{len(map)}")

if __name__ == "__main__":
    main()

