import sys
from collections import defaultdict

def main():
    input = sys.stdin.read().split()
    n = int(input[0])
    map = defaultdict(int)
    index = 1
    for i in range(n):
        val = int(input[index])
        map[val] += 1
        index += 1
    max_value = max(map.values())
    print(f"{max_value}{len(map)}")

if __name__ == "__main__":
    main()
