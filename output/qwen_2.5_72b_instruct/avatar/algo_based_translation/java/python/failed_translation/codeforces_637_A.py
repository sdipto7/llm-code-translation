
import sys
from collections import defaultdict

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    ara = list(map(int, input[1:n+1]))
    map = defaultdict(int)
    for i in range(n):
        v = ara[i]
        map[v] += 1
    max_count = 0
    for count in map.values():
        max_count = max(max_count, count)
    mm = defaultdict(int)
    for i in range(n):
        if mm[ara[i]] == 0:
            mm[ara[i]] += 1
            if mm[ara[i]] == max_count:
                print(ara[i])
                break
        else:
            mm[ara[i]] += 1
            if mm[ara[i]] == max_count:
                print(ara[i])
                break

if __name__ == "__main__":
    main()

