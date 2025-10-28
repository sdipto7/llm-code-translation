
import sys
import collections
from functools import cmp_to_key
from itertools import count

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __hash__(self):
        return self.x * 1000 + self.y

    def __eq__(self, other):
        if not isinstance(other, Pair):
            return False
        return self.x == other.x and self.y == other.y

    def __lt__(self, other):
        min1 = min(self.x, self.y)
        min2 = min(other.x, other.y)
        if min1 != min2:
            return min1 < min2
        if self.x == other.x:
            return self.y < other.y
        return self.x < other.x

    def __str__(self):
        return f"{self.x} {self.y}"

    def add(self, p):
        self.x += p.x
        self.y += p.y

def ceildiv(x, y):
    return (x + y - 1) // y

def mod(x, m):
    return (x % m + m) % m

def gcd(x, y):
    return x if y == 0 else gcd(y, x % y)

def Int(x):
    return 1 if x else 0

def put(map, p):
    if p in map:
        map[p] += 1
    else:
        map[p] = 1

def rem(map, p):
    if map[p] == 1:
        del map[p]
    else:
        map[p] -= 1

def fill(arr, x):
    for i in range(30):
        arr[i] += Int(((1 << i) & x) != 0)

def pow(a, pow):
    ans = 1
    while pow > 0:
        if (pow & 1) == 1:
            ans *= a
        a *= a
        pow >>= 1
    return ans

def linearsieve(x):
    global least, prime
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
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    arr = sorted(map(int, data[1:n+1]), reverse=True)
    
    if n >= 3:
        map = collections.defaultdict(int)
        ans = arr[0] + arr[1]
        put(map, Pair(arr[0], arr[1]))
        p1 = Pair(arr[2], arr[1])
        p2 = Pair(arr[2], arr[0])
        put(map, p1)
        put(map, p2)
        for i in range(3, n):
            p = min(map.keys(), key=cmp_to_key(lambda a, b: (a < b) - (a > b)))
            rem(map, p)
            ans += min(p.x, p.y)
            put(map, Pair(p.x, arr[i]))
            put(map, Pair(p.y, arr[i]))
        print(ans)
    else:
        print(arr[0])

if __name__ == "__main__":
    main()

