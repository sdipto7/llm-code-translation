
import sys
import math
from collections import defaultdict, deque
import heapq

class Main:
    pw = sys.stdout
    sc = None
    adj = None
    visit = None
    dp = {}
    map = {}

    @staticmethod
    def ceildiv(x, y):
        return (x + y - 1) // y

    @staticmethod
    def mod(x, m):
        return (x % m + m) % m

    @staticmethod
    def gcd(x, y):
        return x if y == 0 else Main.gcd(y, x % y)

    @staticmethod
    def Int(x):
        return 1 if x else 0

    @staticmethod
    def put(map, p):
        if p in map:
            map[p] += 1
        else:
            map[p] = 1

    @staticmethod
    def rem(map, p):
        if map[p] == 1:
            del map[p]
        else:
            map[p] -= 1

    @staticmethod
    def main():
        Main.sc = Scanner(sys.stdin)
        n = Main.sc.nextInt()
        arr = Main.sc.nextsort(n)
        arr.sort(reverse=True)
        if n >= 3:
            map = {}
            ans = arr[0] + arr[1]
            Main.put(map, Pair(arr[0], arr[1]))
            p1 = Pair(arr[2], arr[1])
            p2 = Pair(arr[2], arr[0])
            Main.put(map, p1)
            Main.put(map, p2)
            for i in range(3, n):
                p = min(map.keys())
                Main.rem(map, p)
                ans += min(p.x, p.y)
                Main.put(map, Pair(p.x, arr[i]))
                Main.put(map, Pair(p.y, arr[i]))
            Main.pw.write(str(ans) + '\n')
        else:
            Main.pw.write(str(arr[0]) + '\n')
        Main.pw.close()

    @staticmethod
    def fill(arr, x):
        for i in range(30):
            arr[i] += Main.Int((1 << i) & x != 0)

    @staticmethod
    def pow(a, pow):
        ans = 1
        while pow > 0:
            if pow & 1 == 1:
                ans *= a
            a *= a
            pow >>= 1
        return ans

    @staticmethod
    def getpow(x):
        pow = x
        Main.pw.write(f"B {pow}\n")
        Main.pw.flush()
        Main.sc.next()
        Main.pw.write(f"B {pow}\n")
        Main.pw.flush()
        if Main.sc.nextInt() == 1:
            pow *= x
            while True:
                Main.pw.write(f"B {pow}\n")
                Main.pw.flush()
                if Main.sc.nextInt() == 0:
                    return pow // x
                pow *= x
        else:
            return 1

    least = None
    prime = None

    @staticmethod
    def linearsieve(x):
        Main.least = [0] * (x + 1)
        Main.prime = set()
        for i in range(2, x + 1):
            if Main.least[i] == 0:
                Main.least[i] = i
                Main.prime.add(i)
            for y in Main.prime:
                if i * y <= x:
                    Main.least[i * y] = y
                else:
                    break

    @staticmethod
    def printArr(arr):
        Main.pw.write(' '.join(map(str, arr[:-1])) + ' ' + str(arr[-1]) + '\n')

    @staticmethod
    def printArrLong(arr):
        Main.pw.write(' '.join(map(str, arr[:-1])) + ' ' + str(arr[-1]) + '\n')

    @staticmethod
    def printArrInteger(arr):
        Main.pw.write(' '.join(map(str, arr)) + '\n')

    @staticmethod
    def printArrChar(arr):
        Main.pw.write(''.join(['1' if x == 0 else x for x in arr]) + '\n')

    @staticmethod
    def printArrList(lst):
        Main.pw.write(' '.join(map(str, lst)) + '\n')

class Scanner:
    def __init__(self, stream):
        self.br = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.br.readline()

    def nextDouble(self):
        return float(self.next())

    def nextArr(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.nextInt()
        return arr

    def nextsort(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.nextInt()
        return arr

    def nextPair(self):
        return Pair(self.nextInt(), self.nextInt())

    def nextPairArr(self, n):
        arr = [Pair(0, 0)] * n
        for i in range(n):
            arr[i] = self.nextPair()
        return arr

    def ready(self):
        return self.br.ready()

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __hash__(self):
        return self.x * 1000 + self.y

    def __lt__(self, p):
        min1 = min(self.x, self.y)
        min2 = min(p.x, p.y)
        if min1 != min2:
            return min1 < min2
        if self.x == p.x:
            return self.y < p.y
        return self.x < p.x

    def __eq__(self, obj):
        if obj is None:
            return False
        if self.__class__ != obj.__class__:
            return False
        p = obj
        return self.x == p.x and self.y == p.y

    def clone(self):
        return Pair(self.x, self.y)

    def __str__(self):
        return f"{self.x} {self.y}"

    def add(self, p):
        self.x += p.x
        self.y += p.y

if __name__ == "__main__":
    Main.main()

