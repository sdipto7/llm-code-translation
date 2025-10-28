
import sys
from collections import defaultdict
from heapq import heappop, heappush
from math import gcd

input = sys.stdin.read
data = input().split()

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, other):
        return min(self.x, self.y) > min(other.x, other.y) or (min(self.x, self.y) == min(other.x, other.y) and (self.x < other.x or (self.x == other.x and self.y < other.y)))

def ceildiv(x, y):
    return (x + y - 1) // y

def mod(x, m):
    return (x % m + m) % m

def fill(arr, x):
    for i in range(30):
        arr[i] += int(((1 << i) & x) != 0)

def pow(a, power):
    ans = 1
    while power > 0:
        if (power & 1) == 1:
            ans *= a
        a *= a
        power >>= 1
    return ans

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
    return least, prime

def main():
    idx = 0
    n = int(data[idx])
    idx += 1
    arr = list(map(int, data[idx:idx + n]))
    idx += n
    arr.sort(reverse=True)
    if n >= 3:
        map = []
        ans = arr[0] + arr[1]
        heappush(map, Pair(arr[0], arr[1]))
        put(map, Pair(arr[2], arr[1]))
        put(map, Pair(arr[2], arr[0]))
        for i in range(3, n):
            p = heappop(map)
            ans += min(p.x, p.y)
            put(map, Pair(p.x, arr[i]))
            put(map, Pair(p.y, arr[i]))
        print(ans)
    else:
        print(arr[0])

def put(map, p):
    heappush(map, p)

main()

