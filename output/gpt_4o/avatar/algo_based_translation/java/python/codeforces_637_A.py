
import sys
from collections import defaultdict

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    ara = list(map(int, data[1:n+1]))
    
    map = defaultdict(int)
    for v in ara:
        map[v] += 1
    
    max_frequency = max(map.values())
    
    mm = defaultdict(int)
    for i in range(n):
        mm[ara[i]] += 1
        if mm[ara[i]] == max_frequency:
            print(ara[i])
            break

if __name__ == "__main__":
    main()

