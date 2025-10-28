
import sys
from collections import defaultdict, deque, Counter
from heapq import heappush, heappop
import math
import bisect
import random

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
        d = {}
        ans = arr[0] + arr[1]
        d[Pair(arr[0], arr[1])] = d.get(Pair(arr[0], arr[1]), 0) + 1
        p1 = Pair(arr[2], arr[1])
        p2 = Pair(arr[2], arr[0])
        d[p1] = d.get(p1, 0) + 1
        d[p2] = d.get(p2, 0) + 1
        keys = list(d.keys())
        keys.sort(reverse=True)
        for i in range(3, n):
            p = keys[0]
            d[p] -= 1
            if d[p] == 0:
                del d[p]
            ans += min(p.x, p.y)
            p1 = Pair(p.x, arr[i])
            p2 = Pair(p.y, arr[i])
            d[p1] = d.get(p1, 0) + 1
            d[p2] = d.get(p2, 0) + 1
            keys = list(d.keys())
            keys.sort(reverse=True)
        print(ans)
    else:
        print(arr[0])

if __name__ == "__main__":
    main()

