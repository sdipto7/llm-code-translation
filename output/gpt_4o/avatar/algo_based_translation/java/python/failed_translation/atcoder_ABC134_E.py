
import sys
from collections import defaultdict
from sortedcontainers import SortedDict

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    numbers = list(map(int, data[1:n+1]))

    map = SortedDict()

    for num in numbers:
        lower_key = map.bisect_left(num) - 1
        if lower_key < 0:
            val = map.get(num, 0)
            map[num] = val + 1
        else:
            key = map.iloc[lower_key]
            val = map[key]
            if val == 1:
                del map[key]
            else:
                map[key] = val - 1
            val = map.get(num, 0)
            map[num] = val + 1

    ans = sum(map.values())
    print(ans)

if __name__ == "__main__":
    main()

