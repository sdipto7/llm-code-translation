
import sys
import collections
import heapq

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
    
    def clone(self):
        return Pair(self.x, self.y)
    
    def add(self, other):
        self.x += other.x
        self.y += other.y

def ceildiv(x, y):
    return (x + y - 1) // y

def mod(x, m):
    return (x % m + m) % m

def gcd(x, y):
    return x if y == 0 else gcd(y, x % y)

def Int(x):
    return 1 if x else 0

def put(map_obj, p):
    if p in map_obj:
        map_obj[p] += 1
    else:
        map_obj[p] = 1

def rem(map_obj, p):
    if map_obj[p] == 1:
        del map_obj[p]
    else:
        map_obj[p] -= 1

def fill(arr, x):
    for i in range(30):
        arr[i] += Int(((1 << i) & x) != 0)

def pow_func(a, pow_val):
    ans = 1
    while pow_val > 0:
        if pow_val & 1:
            ans *= a
        a *= a
        pow_val >>= 1
    return ans

def getpow(x):
    pow_val = x
    print(f"B {pow_val}")
    sys.stdout.flush()
    input()
    print(f"B {pow_val}")
    sys.stdout.flush()
    if int(input()) == 1:
        pow_val *= x
        while True:
            print(f"B {pow_val}")
            sys.stdout.flush()
            if int(input()) == 0:
                return pow_val // x
            pow_val *= x
    else:
        return 1

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
    if isinstance(arr, list):
        print(' '.join(map(str, arr)))
    elif isinstance(arr, collections.UserList):
        print(' '.join(map(str, arr)))

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    arr = list(map(int, data[1:1+n]))
    
    arr.sort(reverse=True)
    
    if n >= 3:
        map_obj = {}
        ans = arr[0] + arr[1]
        put(map_obj, Pair(arr[0], arr[1]))
        p1 = Pair(arr[2], arr[1])
        p2 = Pair(arr[2], arr[0])
        put(map_obj, p1)
        put(map_obj, p2)
        
        for i in range(3, n):
            keys = sorted(map_obj.keys(), reverse=True)
            p = keys[0]
            rem(map_obj, p)
            ans += min(p.x, p.y)
            put(map_obj, Pair(p.x, arr[i]))
            put(map_obj, Pair(p.y, arr[i]))
        
        print(ans)
    else:
        print(arr[0])

if __name__ == "__main__":
    main()

