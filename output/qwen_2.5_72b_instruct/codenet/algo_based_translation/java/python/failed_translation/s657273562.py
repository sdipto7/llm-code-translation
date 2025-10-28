
from collections import defaultdict, deque
from typing import List, Tuple

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, other):
        min1 = min(self.x, self.y)
        min2 = min(other.x, other.y)
        if min1 != min2:
            return min1 < min2
        if self.x == other.x:
            return self.y < other.y
        return self.x < other.x

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return hash((self.x, self.y))

    def __repr__(self):
        return f"({self.x}, {self.y})"

def ceildiv(x, y):
    return (x + y - 1) // y

def mod(x, m):
    return (x % m + m) % m

def gcd(x, y):
    return x if y == 0 else gcd(y, x % y)

def Int(x):
    return 1 if x else 0

def put(map, p):
    map[p] = map.get(p, 0) + 1

def rem(map, p):
    if map[p] == 1:
        del map[p]
    else:
        map[p] -= 1

def fill(arr, x):
    for i in range(30):
        arr[i] += Int(((1 << i) & x) != 0)

def pow(a, p):
    ans = 1
    while p > 0:
        if (p & 1) == 1:
            ans *= a
        a *= a
        p >>= 1
    return ans

def getpow(x):
    pow = x
    print(f"B {pow}")
    input()
    print(f"B {pow}")
    input()
    if int(input()) == 1:
        pow *= x
        while True:
            print(f"B {pow}")
            input()
            if int(input()) == 0:
                return pow // x
            pow *= x
    else:
        return 1

def linearsieve(x):
    least = [0] * (x + 1)
    prime = set()
    for i in range(2, x + 1):
        if least[i] == 0:
            least[i] = i
            prime.add(i)
        for y in prime:
            if i * y <= x:
                least[i * y] = y
            else:
                break

def printArr(arr):
    print(" ".join(map(str, arr)))

def main():
    import sys
    import heapq

    sc = sys.stdin
    pw = sys.stdout

    n = int(sc.readline().strip())
    arr = list(map(int, sc.readline().strip().split()))
    arr.sort(reverse=True)

    if n >= 3:
        map = {}
        ans = arr[0] + arr[1]
        put(map, Pair(arr[0], arr[1]))
        p1 = Pair(arr[2], arr[1])
        p2 = Pair(arr[2], arr[0])
        put(map, p1)
        put(map, p2)
        sorted_keys = sorted(map.keys(), reverse=True)
        for i in range(3, n):
            p = sorted_keys.pop()
            rem(map, p)
            ans += min(p.x, p.y)
            put(map, Pair(p.x, arr[i]))
            put(map, Pair(p.y, arr[i]))
            sorted_keys = sorted(map.keys(), reverse=True)
        pw.write(f"{ans}\n")
    else:
        pw.write(f"{arr[0]}\n")

if __name__ == "__main__":
    main()

