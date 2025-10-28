
import sys
import math
import itertools
from collections import deque
from heapq import heappush, heappop
from typing import List, Tuple

class Graph0n:
    def __init__(self, sz: int):
        self.dt = [Node0n() for _ in range(sz)]

    def add(self, vn: int, val: int):
        self.dt[vn].add(val)

    def add2(self, vn: int, val: int):
        self.dt[vn].add(val)
        self.dt[val].add(vn)

    def get(self, vn: int, index: int) -> int:
        return self.dt[vn].get(index)

    def get_all(self, vn: int) -> List[int]:
        return self.dt[vn].get_all()

    def size_of(self, vn: int) -> int:
        return self.dt[vn].size()

    def clear(self):
        for node in self.dt:
            node.clear()

class Node0n:
    def __init__(self):
        self.next_vs = []

    def add(self, val: int):
        self.next_vs.append(val)

    def get(self, ad: int) -> int:
        return self.next_vs[ad]

    def get_all(self) -> List[int]:
        return self.next_vs

    def size(self) -> int:
        return len(self.next_vs)

    def clear(self):
        self.next_vs.clear()

class Edge:
    def __init__(self, vn: int = -1, w: int = 0, cm: int = -1):
        self.from_ = cm
        self.v2 = vn
        self.weight = w

class Edge2:
    def __init__(self, vn: int, w1: int, w2: int):
        self.v2 = vn
        self.cost1 = w1
        self.cost2 = w2

class Comparator_Edge:
    def __call__(self, a: Edge, b: Edge) -> int:
        if a.weight > b.weight:
            return -1
        elif a.weight < b.weight:
            return 1
        else:
            return b.v2 - a.v2

class V2Comp:
    def __call__(self, a: Edge, b: Edge) -> int:
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
    def __call__(self, a: Edge, b: Edge) -> int:
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
    def __init__(self, sx: int, sy: int):
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
                print(0, file=out)
                continue
            dw = surp9
            dif = pow10E97(2, n - p - 1, pop1st - 1)
            dw -= dif
            dw += (pop1st - 1)
            dw %= (pop1st - 1)
            ans = 1
            while dw != 0:
                if dw < 0:
                    print(1 / 0, file=out)
                count = countFlaged(dw)
                dw %= count
                ans += 1
            print(ans, file=out)
        else:
            dw = surp1
            dif = pow10E97(2, n - p - 1, pop1st + 1)
            dw += dif
            dw %= (pop1st + 1)
            ans = 1
            while dw != 0:
                if dw < 0:
                    print(1 / 0, file=out)
                count = countFlaged(dw)
                dw %= count
                ans += 1
            print(ans, file=out)
    out.flush()

INF = int(1e8)
INFL = int(1e17)
e97 = int(1e9 + 7)

def assertion(b: bool):
    if not b:
        raise AssertionError()

def abs_val(a: int) -> int:
    return a if a >= 0 else -a

def abs_long(a: int) -> int:
    return a if a >= 0 else -a

def abs_double(a: float) -> float:
    return a if a >= 0 else -a

def min_val(a: int, b: int) -> int:
    return b if a > b else a

def min_long(a: int, b: int) -> int:
    return b if a > b else a

def min_double(a: float, b: float) -> float:
    return b if a > b else a

def max_val(a: int, b: int) -> int:
    return a if a > b else b

def max_long(a: int, b: int) -> int:
    return a if a > b else b

def max_double(a: float, b: float) -> float:
    return a if a > b else b

def minN(*ins: int) -> int:
    min_val = ins[0]
    for i in range(1, len(ins)):
        if ins[i] < min_val:
            min_val = ins[i]
    return min_val

def maxN(*ins: int) -> int:
    max_val = ins[0]
    for i in range(1, len(ins)):
        if ins[i] > max_val:
            max_val = ins[i]
    return max_val

def minN_long(*ins: int) -> int:
    min_val = ins[0]
    for i in range(1, len(ins)):
        if ins[i] < min_val:
            min_val = ins[i]
    return min_val

def maxN_long(*ins: int) -> int:
    max_val = ins[0]
    for i in range(1, len(ins)):
        if ins[i] > max_val:
            max_val = ins[i]
    return max_val

def minExAd(dt: List[int], ad: int) -> int:
    min_val = INF
    for i in range(len(dt)):
        if i != ad and dt[i] < min_val:
            min_val = dt[i]
    return min_val

def minExAd_long(dt: List[int], ad: int) -> int:
    min_val = INFL
    for i in range(len(dt)):
        if i != ad and dt[i] < min_val:
            min_val = dt[i]
    return min_val

def minExVal(dt: List[int], ex_val: int) -> int:
    min_val = INF
    for i in range(len(dt)):
        if dt[i] != ex_val and dt[i] < min_val:
            min_val = dt[i]
    return min_val

def minExVal_long(dt: List[int], ex_val: int) -> int:
    min_val = INFL
    for i in range(len(dt)):
        if dt[i] != ex_val and dt[i] < min_val:
            min_val = dt[i]
    return min_val

def maxExAd(dt: List[int], ad: int) -> int:
    max_val = -INF
    for i in range(len(dt)):
        if i != ad and dt[i] > max_val:
            max_val = dt[i]
    return max_val

def maxExAd_long(dt: List[int], ad: int) -> int:
    max_val = -INFL
    for i in range(len(dt)):
        if i != ad and dt[i] > max_val:
            max_val = dt[i]
    return max_val

def maxExVal(dt: List[int], ex_val: int) -> int:
    max_val = -INF
    for i in range(len(dt)):
        if dt[i] != ex_val and dt[i] > max_val:
            max_val = dt[i]
    return max_val

def maxExVal_long(dt: List[int], ex_val: int) -> int:
    max_val = -INFL
    for i in range(len(dt)):
        if dt[i] != ex_val and dt[i] > max_val:
            max_val = dt[i]
    return max_val

def sumA(dt: List[int]) -> int:
    return sum(dt)

def sumA_long(dt: List[int]) -> int:
    return sum(dt)

def sumA_list(dt: List[int]) -> int:
    return sum(dt)

def same3(a: int, b: int, c: int) -> bool:
    return a == b == c

def dif3(a: int, b: int, c: int) -> bool:
    return a != b and b != c and c != a

def triangle_inequality(a: int, b: int, c: int) -> bool:
    return (a + b) >= c and (b + c) >= a and (c + a) >= b

def hypod(a: float, b: float) -> float:
    return math.sqrt(a * a + b * b)

def factorial(n: int) -> int:
    ans = 1
    for i in range(n, 0, -1):
        ans *= i
    return ans

def facP(n: int, p: int) -> int:
    ans = 1
    for i in range(n, 0, -1):
        ans *= i
        ans %= p
    return ans

def lcm(m: int, n: int) -> int:
    ans = m // gcd(m, n)
    ans *= n
    return ans

def gcd(m: int, n: int) -> int:
    if m < n:
        return gcd(n, m)
    if n == 0:
        return m
    return gcd(n, m % n)

def is_prime(a: int) -> bool:
    if a == 1:
        return False
    for i in range(2, int(math.sqrt(a)) + 1):
        if a % i == 0:
            return False
    return True

def modinv(a: int, p: int) -> int:
    b, u, v = p, 1, 0
    while b > 0:
        t = a // b
        a, b = b, a % b
        u, v = v, u - t * v
    u %= p
    if u < 0:
        u += p
    return u

def pow_int(n: int, k: int) -> int:
    ans = 1
    for _ in range(k):
        ans *= n
    return ans

def pow_long(n: int, k: int) -> int:
    ans = 1
    for _ in range(k):
        ans *= n
    return ans

def pow2_int(inp: int) -> int:
    return inp * inp

def pow2_long(inp: int) -> int:
    return inp * inp

def pow2_double(inp: float) -> float:
    return inp * inp

def getDigit2(num: int) -> int:
    cf, d = 1, 0
    while num >= cf:
        d += 1
        cf = (1 << d)
    return d

def getDigit10(num: int) -> int:
    cf, d = 1, 0
    while num >= cf:
        d += 1
        cf *= 10
    return d

def isINF(inp: int) -> bool:
    return (inp * 20) > INF

def isINFL(inp: int) -> bool:
    return (inp * 10000) > INFL

def pow10E97(ob: int, soeji: int, p: int) -> int:
    if ob == 0:
        return 0
    if soeji == 0:
        return 1
    if soeji == 2:
        return (ob * ob) % p

    d = getDigit2(soeji)
    ob_pow_2pow = [0] * d
    ob_pow_2pow[0] = ob
    for i in range(1, d):
        ob_pow_2pow[i] = (ob_pow_2pow[i - 1] * ob_pow_2pow[i - 1]) % p

    ans = 1
    for i in range(d - 1, -1, -1):
        if soeji >= (1 << i):
            soeji -= (1 << i)
            ans = (ans * ob_pow_2pow[i]) % p
    return ans % p

def flag(pos: int) -> int:
    return (1 << pos)

def isFlaged_int(bit: int, pos: int) -> bool:
    return (bit & (1 << pos)) > 0

def isFlaged_long(bit: int, pos: int) -> bool:
    return (bit & (1 << pos)) > 0

def deflag(bit: int, pos: int) -> int:
    return bit & ~(1 << pos)

def countFlaged(bit: int) -> int:
    ans = 0
    for i in range(getDigit2(bit)):
        if (bit & (1 << i)) > 0:
            ans += 1
    return ans

def countFlaged_long(bit: int) -> int:
    ans = 0
    for i in range(getDigit2(bit)):
        if (bit & (1 << i)) > 0:
            ans += 1
    return ans

def showflag(bit: int):
    for i in range(getDigit2(bit)):
        if isFlaged_int(bit, i):
            print("O", end="")
        else:
            print(".", end="")
    print()

def biSearch(dt: List[int], target: int) -> int:
    left, right = 0, len(dt) - 1
    mid = -1
    while left <= right:
        mid = (right + left) // 2
        if dt[mid] == target:
            return mid
        if dt[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

def biSearchMax(dt: List[int], target: int) -> int:
    left, right = -1, len(dt)
    mid = -1
    while (right - left) > 1:
        mid = left + (right - left) // 2
        if dt[mid] <= target:
            left = mid
        else:
            right = mid
    return left

def biSearchMaxAL(dt: List[int], target: int) -> int:
    left, right = -1, len(dt)
    mid = -1
    while (right - left) > 1:
        mid = left + (right - left) // 2
        if dt[mid] <= target:
            left = mid
        else:
            right = mid
    return left

def fill_parent(ob: List[int]):
    for i in range(len(ob)):
        ob[i] = i

def get_root_uf(parent: List[int], index: int) -> int:
    if parent[index] == index:
        return index
    root = get_root_uf(parent, parent[index])
    parent[index] = root
    return root

def is_same_uf(parent: List[int], x: int, y: int) -> bool:
    return get_root_uf(parent, x) == get_root_uf(parent, y)

def unite_uf(parent: List[int], receiver: int, attacker: int):
    parent[get_root_uf(parent, attacker)] = get_root_uf(parent, receiver)

Xdir4 = [1, 0, 0, -1]
Ydir4 = [0, 1, -1, 0]
Xdir8 = [1, 1, 1, 0, 0, -1, -1, -1]
Ydir8 = [1, 0, -1, 1, -1, 1, 0, -1]

def is_in_area(y: int, x: int, h: int, w: int) -> bool:
    if y < 0:
        return False
    if x < 0:
        return False
    if y >= h:
        return False
    if x >= w:
        return False
    return True

def show2_bool(dt: List[List[bool]], lit_x: int, lit_y: int):
    out = sys.stdout
    for j in range(len(dt)):
        for i in range(len(dt[j])):
            if (i == lit_y) and (j == lit_x):
                print("X", end="", file=out)
            elif dt[j][i]:
                print("O", end="", file=out)
            else:
                print(".", end="", file=out)
        print(file=out)
    out.flush()

def show2_int(dt: List[List[int]], cmnt: str):
    out = sys.stdout
    for i in range(len(dt)):
        for j in range(len(dt[i])):
            print(f"{dt[i][j]},", end="", file=out)
        print(f"<-{cmnt}:{i}", file=out)
    out.flush()

def show2_long(dt: List[List[int]], cmnt: str):
    out = sys.stdout
    for i in range(len(dt)):
        for j in range(len(dt[i])):
            print(f"{dt[i][j]},", end="", file=out)
        print(f"<-{cmnt}:{i}", file=out)
    out.flush()

def disp_que(dt: deque):
    while len(dt) > 0:
        a = dt.popleft()
        print(a, end="")
    print("\n")

def disp_list(dt: List):
    for i in range(len(dt)):
        print(f"{dt[i]},", end="")
    print("\n")

def prtlnas(as_list: List[int]):
    out = sys.stdout
    for val in as_list:
        print(val, file=out)
    out.flush()

def prtlnas_long(as_list: List[int]):
    out = sys.stdout
    for val in as_list:
        print(val, file=out)
    out.flush()

def prtspas(as_list: List[int]):
    out = sys.stdout
    print(as_list[0], end="", file=out)
    for val in as_list[1:]:
        print(f" {val}", end="", file=out)
    print(file=out)
    out.flush()

def prtspas_long(as_list: List[int]):
    out = sys.stdout
    print(as_list[0], end="", file=out)
    for val in as_list[1:]:
        print(f" {val}", end="", file=out)
    print(file=out)
    out.flush()

def prtspas_list(as_list: List):
    out = sys.stdout
    print(as_list[0], end="", file=out)
    for val in as_list[1:]:
        print(f" {val}", end="", file=out)
    print(file=out)
    out.flush()

def fill_bool(ob: List[bool], res: bool):
    for i in range(len(ob)):
        ob[i] = res

def fill_int(ob: List[int], res: int):
    for i in range(len(ob)):
        ob[i] = res

def fill_long(ob: List[int], res: int):
    for i in range(len(ob)):
        ob[i] = res

def fill_char(ob: List[str], res: str):
    for i in range(len(ob)):
        ob[i] = res

def fill_double(ob: List[float], res: float):
    for i in range(len(ob)):
        ob[i] = res

def fill_bool_2d(ob: List[List[bool]], res: bool):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            ob[i][j] = res

def fill_int_2d(ob: List[List[int]], res: int):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            ob[i][j] = res

def fill_long_2d(ob: List[List[int]], res: int):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            ob[i][j] = res

def fill_char_2d(ob: List[List[str]], res: str):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            ob[i][j] = res

def fill_double_2d(ob: List[List[float]], res: float):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            ob[i][j] = res

def fill_int_3d(ob: List[List[List[int]]], res: int):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            for k in range(len(ob[i][j])):
                ob[i][j][k] = res

def fill_long_3d(ob: List[List[List[int]]], res: int):
    for i in range(len(ob)):
        for j in range(len(ob[i])):
            for k in range(len(ob[i][j])):
                ob[i][j][k] = res

class FastScanner:
    def __init__(self):
        self.in_stream = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self) -> bool:
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in_stream.readinto(self.buffer)
            except IOError:
                return False
            if self.buflen <= 0:
                return False
        return True

    def readByte(self) -> int:
        if self.hasNextByte():
            res = self.buffer[self.ptr]
            self.ptr += 1
            return res
        else:
            return -1

    @staticmethod
    def isPrintableChar(c: int) -> bool:
        return 33 <= c <= 126

    def hasNext(self) -> bool:
        while self.hasNextByte() and not FastScanner.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self) -> str:
        if not self.hasNext():
            raise StopIteration
        sb = []
        b = self.readByte()
        while FastScanner.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nexL(self) -> int:
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not FastScanner.isPrintableChar(b) or b == ord(':'):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nexI(self) -> int:
        nl = self.nexL()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)

    def nexD(self) -> float:
        return float(self.next())

    def ni(self, array2: List[int]):
        for i in range(len(array2)):
            array2[i] = self.nexI()

    def ni2(self, as_list: List[int], bs_list: List[int]):
        for i in range(len(as_list)):
            as_list[i] = self.nexI()
            bs_list[i] = self.nexI()

    def ni3(self, as_list: List[int], bs_list: List[int], cs_list: List[int]):
        for i in range(len(as_list)):
            as_list[i] = self.nexI()
            bs_list[i] = self.nexI()
            cs_list[i] = self.nexI()

    def nisan(self, as_list: List[List[int]]):
        for i in range(len(as_list)):
            for j in range(len(as_list[i])):
                as_list[i][j] = self.nexI()

if __name__ == '__main__':
    main()

