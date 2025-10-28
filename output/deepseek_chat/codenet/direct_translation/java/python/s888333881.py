
import sys
import math
from collections import deque

class Graph0n:
    def __init__(self, size):
        self.dt = [Node0n() for _ in range(size)]

    def add(self, vn, val):
        self.dt[vn].add(val)

    def add2(self, vn, val):
        self.dt[vn].add(val)
        self.dt[val].add(vn)

    def get(self, vn, index):
        return self.dt[vn].get(index)

    def get_all(self, vn):
        return self.dt[vn].get_all()

    def size_of(self, vn):
        return self.dt[vn].size()

    def clear(self):
        for node in self.dt:
            node.clear()

class Node0n:
    def __init__(self):
        self.next_vs = []

    def add(self, val):
        self.next_vs.append(val)

    def get(self, ad):
        return self.next_vs[ad]

    def get_all(self):
        return self.next_vs

    def size(self):
        return len(self.next_vs)

    def clear(self):
        self.next_vs.clear()

class Edge:
    def __init__(self, vn, weight):
        self.v2 = vn
        self.weight = weight

class Edge2:
    def __init__(self, vn, w1, w2):
        self.v2 = vn
        self.cost1 = w1
        self.cost2 = w2

class Comparator_Edge:
    def __init__(self):
        pass

    def compare(self, a, b):
        if a.weight > b.weight:
            return -1
        elif a.weight < b.weight:
            return 1
        else:
            return b.v2 - a.v2

class V2Comp:
    def __init__(self):
        pass

    def compare(self, a, b):
        if a.v2 > b.v2:
            return -1
        elif a.v2 < b.v2:
            return 1
        elif a.weight > b.weight:
            return -1
        elif a.weight < b.weight:
            return 1
        else:
            return 0

class antiV2:
    def __init__(self):
        pass

    def compare(self, a, b):
        if a.v2 > b.v2:
            return 1
        elif a.v2 < b.v2:
            return -1
        elif a.weight > b.weight:
            return -1
        elif a.weight < b.weight:
            return 1
        else:
            return 0

class Vector:
    def __init__(self, sx, sy):
        self.x = sx
        self.y = sy

def main():
    sc = FastScanner()
    out = sys.stdout
    n = sc.nexI()
    s = sc.next()
    flaged = [False] * n
    pop1st = 0
    for i in range(n):
        if s[i] == '1':
            flaged[i] = True
            pop1st += 1
    surp1 = 0
    for i in range(n):
        surp1 *= 2
        if flaged[i]:
            surp1 += 1
        surp1 %= (pop1st + 1)
    surp9 = 0
    if pop1st > 1:
        for i in range(n):
            surp9 *= 2
            if flaged[i]:
                surp9 += 1
            surp9 %= (pop1st - 1)
    for p in range(n):
        if flaged[p]:
            if pop1st == 1:
                out.write("0\n")
                continue
            dw = surp9
            dif = pow(2, n - p - 1, pop1st - 1)
            dw -= dif
            dw += (pop1st - 1)
            dw %= (pop1st - 1)
            ans = 1
            while dw != 0:
                if dw < 0:
                    out.write("1/0\n")
                count = count_flaged(dw)
                dw %= count
                ans += 1
            out.write(str(ans) + "\n")
        else:
            dw = surp1
            dif = pow(2, n - p - 1, pop1st + 1)
            dw += dif
            dw %= (pop1st + 1)
            ans = 1
            while dw != 0:
                if dw < 0:
                    out.write("1/0\n")
                count = count_flaged(dw)
                dw %= count
                ans += 1
            out.write(str(ans) + "\n")
    out.flush()

def count_flaged(bit):
    ans = 0
    for i in range(bit.bit_length()):
        if bit & (1 << i):
            ans += 1
    return ans

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.ptr = 0

    def next(self):
        if self.ptr >= len(self.buffer):
            self.buffer = sys.stdin.read().split()
            self.ptr = 0
        self.ptr += 1
        return self.buffer[self.ptr - 1]

    def nexI(self):
        return int(self.next())

    def nexL(self):
        return int(self.next())

    def nexD(self):
        return float(self.next())

    def ni(self, array2):
        for i in range(len(array2)):
            array2[i] = self.nexL()

    def ni(self, array2):
        for i in range(len(array2)):
            array2[i] = self.nexI()

    def ni(self, as_, bs):
        for i in range(len(as_)):
            as_[i] = self.nexI()
            bs[i] = self.nexI()

    def ni(self, as_, bs):
        for i in range(len(as_)):
            as_[i] = self.nexL()
            bs[i] = self.nexL()

    def ni(self, as_, bs, cs):
        for i in range(len(as_)):
            as_[i] = self.nexI()
            bs[i] = self.nexI()
            cs[i] = self.nexI()

    def nisan(self, as_):
        for i in range(len(as_)):
            for j in range(len(as_[0])):
                as_[i][j] = self.nexI()

if __name__ == "__main__":
    main()

