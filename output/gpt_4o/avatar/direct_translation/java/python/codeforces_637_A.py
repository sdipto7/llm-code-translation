
import sys
from collections import defaultdict

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    ara = list(map(int, data[1:n+1]))
    map_count = defaultdict(int)
    
    for v in ara:
        map_count[v] += 1

    max_count = max(map_count.values())

    mm = defaultdict(int)
    for v in ara:
        mm[v] += 1
        if mm[v] == max_count:
            print(v)
            break

if __name__ == "__main__":
    main()

