
import sys
from collections import defaultdict
from functools import cmp_to_key

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, other):
        min1 = min(self.x, self.y)
        min2 = min(other.x, other.y)
        if min1 != min2:
            return min1 > min2
        if self.x == other.x:
            return self.y > other.y
        return self.x > other.x

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return hash((self.x, self.y))

def main():
    input = sys.stdin.readline
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort(reverse=True)
    if n >= 3:
        map = defaultdict(int)
        ans = arr[0] + arr[1]
        map[Pair(arr[0], arr[1])] += 1
        map[Pair(arr[2], arr[1])] += 1
        map[Pair(arr[2], arr[0])] += 1
        for i in range(3, n):
            p = max(map, key=lambda x: x)
            ans += min(p.x, p.y)
            map[p] -= 1
            if map[p] == 0:
                del map[p]
            map[Pair(p.x, arr[i])] += 1
            map[Pair(p.y, arr[i])] += 1
        print(ans)
    else:
        print(max(arr))

if __name__ == "__main__":
    main()

