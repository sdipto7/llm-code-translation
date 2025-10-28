
import sys
import math
from collections import defaultdict, deque

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __hash__(self):
        return self.x * 1000 + self.y

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __lt__(self, other):
        min1 = min(self.x, self.y)
        min2 = min(other.x, other.y)
        if min1 != min2:
            return min1 < min2
        if self.x == other.x:
            return self.y < other.y
        return self.x < other.x

    def __repr__(self):
        return f"{self.x} {self.y}"

def ceildiv(x, y):
    return (x + y - 1) // y

def mod(x, m):
    return (x % m + m) % m

def gcd(x, y):
    return x if y == 0 else gcd(y, x % y)

def Int(x):
    return 1 if x else 0

def put(map, p):
    map[p] += 1

def rem(map, p):
    if map[p] == 1:
        del map[p]
    else:
        map[p] -= 1

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    index = 0

    def nextInt():
        nonlocal index
        result = int(data[index])
        index += 1
        return result

    def nextLine():
        nonlocal index
        result = data[index]
        index += 1
        return result

    n = nextInt()
    arr = [nextInt() for _ in range(n)]
    arr.sort(reverse=True)
    if n >= 3:
        map = defaultdict(int)
        ans = arr[0] + arr[1]
        map[Pair(arr[0], arr[1])] = 1
        p1 = Pair(arr[2], arr[1])
        p2 = Pair(arr[2], arr[0])
        put(map, p1)
        put(map, p2)
        for i in range(3, n):
            keys = sorted(map.keys(), reverse=True)
            p = keys[0]
            rem(map, p)
            ans += min(p.x, p.y)
            put(map, Pair(p.x, arr[i]))
            put(map, Pair(p.y, arr[i]))
        print(ans)
    else:
        print(arr[0])

if __name__ == "__main__":
    main()

