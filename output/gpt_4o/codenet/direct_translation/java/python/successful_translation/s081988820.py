
import sys
import math
from typing import List, Optional

class Main:
    def main(self):
        self.solve()

    def solve(self):
        sc = Scanner(sys.stdin)
        H = sc.next_int()
        W = sc.next_int()
        c = [[sc.next_int() for _ in range(10)] for _ in range(10)]
        min_cost = [c[i][1] for i in range(10)]
        
        for _ in range(10):
            for i in range(10):
                for j in range(10):
                    min_cost[i] = min(min_cost[i], c[i][j] + min_cost[j])
        
        ans = 0
        for _ in range(H):
            for _ in range(W):
                A = sc.next_int()
                if A >= 0:
                    ans += min_cost[A]
        
        print(ans)

class Scanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = bytearray(1024)
        self.index = 0
        self.length = 0

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def is_digit(self, c):
        return 48 <= c <= 57

    def has_next_byte(self):
        if self.index < self.length:
            return True
        else:
            self.length = sys.stdin.buffer.readinto(self.buffer)
            self.index = 0
            return self.length > 0

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
            self.index += 1
        return self.has_next_byte()

    def read_byte(self):
        if self.has_next_byte():
            result = self.buffer[self.index]
            self.index += 1
            return result
        return -1

    def next(self):
        if not self.has_next():
            raise RuntimeError("no input")
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise RuntimeError("no input")
        value = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        while self.is_printable_char(b):
            if self.is_digit(b):
                value = value * 10 + (b - ord('0'))
            b = self.read_byte()
        return -value if minus else value

    def next_int(self):
        return int(self.next_long())

    def next_double(self):
        return float(self.next())

class SieveMobiusFunction:
    def __init__(self, size):
        self.size = size
        self.mobius_function_values = [1] * size
        self.mobius_function_values[0] = 0
        self.mobius_function_values[1] = 1
        for i in range(2, size):
            for k in range(1, (size - 1) // (i * i) + 1):
                self.mobius_function_values[i * i * k] *= 0
        for i in range(2, size):
            if self.mobius_function_values[i] == 1:
                for k in range(1, (size - 1) // i + 1):
                    self.mobius_function_values[i * k] *= -2
            if self.mobius_function_values[i] > 1:
                self.mobius_function_values[i] = 1
            if self.mobius_function_values[i] < -1:
                self.mobius_function_values[i] = -1

    def get(self, n):
        if n > self.size:
            raise RuntimeError("n is greater than size.")
        if n < 0:
            return 0
        return self.mobius_function_values[n]

class PrimeFactorizationMobiusFunction:
    def get(self, n):
        if n <= 0:
            return 0
        if n == 1:
            return 1
        num = 0
        for i in range(2, n):
            if n % i == 0:
                n //= i
                num += 1
                if n % i == 0:
                    return 0
        return -1 if num % 2 == 0 else 1

class FactorialTableCombCalculator:
    def __init__(self, size, mod):
        self.size = size
        self.factorial_table = [1] * (size + 1)
        self.inverse_factorial_table = [1] * (size + 1)
        self.mod = mod

        for i in range(1, size + 1):
            self.factorial_table[i] = (self.factorial_table[i - 1] * i) % mod
        self.inverse_factorial_table[size] = self.inverse(self.factorial_table[size], mod)
        for i in range(size - 1, -1, -1):
            self.inverse_factorial_table[i] = (self.inverse_factorial_table[i + 1] * (i + 1)) % mod

    def inverse(self, n, mod):
        return self.pow(n, mod - 2, mod)

    def pow(self, n, p, mod):
        if p == 0:
            return 1
        half = self.pow(n, p // 2, mod)
        ret = (half * half) % mod
        if p % 2 == 1:
            ret = (ret * n) % mod
        return ret

    def comb(self, n, m):
        if n > self.size:
            raise RuntimeError("n is greater than size.")
        if n < 0 or m < 0 or n < m:
            return 0
        return (((self.factorial_table[n] * self.inverse_factorial_table[m]) % self.mod) * self.inverse_factorial_table[n - m]) % self.mod

class TableCombCalculator:
    def __init__(self, size, mod):
        self.size = size
        self.table = [[0] * (n + 1) for n in range(size + 1)]
        self.table[0][0] = 1
        for n in range(1, size + 1):
            self.table[n][0] = 1
            for m in range(1, n):
                self.table[n][m] = (self.table[n - 1][m - 1] + self.table[n - 1][m]) % mod
            self.table[n][n] = 1

    def comb(self, n, m):
        if n > self.size:
            raise RuntimeError("n is greater than size.")
        if n < 0 or m < 0 or n < m:
            return 0
        return self.table[n][m]

class ArrayGraph:
    def __init__(self, n):
        self.cost_array = [[None] * n for _ in range(n)]
        self.vertex_num = n

    def link(self, from_, to, cost):
        self.cost_array[from_][to] = cost

    def get_cost(self, from_, to):
        return self.cost_array[from_][to]

    def get_vertex_num(self):
        return self.vertex_num

class DfsFlowResolver:
    def __init__(self, graph):
        self.graph = graph

    def max_flow(self, from_, to):
        sum_flow = 0
        current_flow = 0
        while True:
            current_flow = self.flow(from_, to, float('inf'), [False] * self.graph.get_vertex_num())
            sum_flow += current_flow
            if current_flow <= 0:
                break
        return sum_flow

    def flow(self, from_, to, current_flow, passed):
        passed[from_] = True
        if from_ == to:
            return current_flow
        for id_ in range(self.graph.get_vertex_num()):
            if passed[id_]:
                continue
            cost = self.graph.get_cost(from_, id_)
            if cost is not None and cost > 0:
                next_flow = min(current_flow, cost)
                return_flow = self.flow(id_, to, next_flow, passed)
                if return_flow > 0:
                    self.graph.link(from_, id_, cost - return_flow)
                    self.graph.link(id_, from_, (self.graph.get_cost(id_, from_) or 0) + return_flow)
                    return return_flow
        return 0

class BinaryIndexedTree:
    def __init__(self, size):
        self.array = [0] * (size + 1)

    def add(self, index, value):
        i = index
        while i < len(self.array):
            self.array[i] += value
            i += i & -i

    def get_sum(self, index):
        sum_ = 0
        i = index
        while i > 0:
            sum_ += self.array[i]
            i -= i & -i
        return sum_

class BinaryIndexedTree2D:
    def __init__(self, size1, size2):
        self.array = [[0] * (size2 + 1) for _ in range(size1 + 1)]

    def add(self, index1, index2, value):
        i1 = index1
        while i1 < len(self.array):
            i2 = index2
            while i2 < len(self.array[0]):
                self.array[i1][i2] += value
                i2 += i2 & -i2
            i1 += i1 & -i1

    def get_sum(self, index1, index2):
        sum_ = 0
        i1 = index1
        while i1 > 0:
            i2 = index2
            while i2 > 0:
                sum_ += self.array[i1][i2]
                i2 -= i2 & -i2
            i1 -= i1 & -i1
        return sum_

class SetUnionFind:
    def __init__(self, size):
        self.parent = list(range(size))
        self.rank = [0] * size
        self.size = size
        self.map = {i: {i} for i in range(size)}

    def union(self, A, B):
        rootA = self.root(A)
        rootB = self.root(B)
        if rootA != rootB:
            if self.rank[rootA] < self.rank[rootB]:
                self.union_to(rootA, rootB)
            else:
                self.union_to(rootB, rootA)
                if self.rank[rootA] == self.rank[rootB]:
                    self.rank[rootA] += 1

    def union_to(self, source, dest):
        self.parent[source] = dest
        self.map[dest].update(self.map[source])

    def judge(self, A, B):
        return self.root(A) == self.root(B)

    def get_set(self, id_):
        return self.map[self.root(id_)]

    def root(self, id_):
        if self.parent[id_] == id_:
            return id_
        self.parent[id_] = self.root(self.parent[id_])
        return self.parent[id_]

class ArrayUnionFind:
    def __init__(self, size):
        self.parent = list(range(size))
        self.rank = [0] * size
        self.size = size

    def union(self, A, B):
        rootA = self.root(A)
        rootB = self.root(B)
        if rootA != rootB:
            if self.rank[rootA] < self.rank[rootB]:
                self.union_to(rootA, rootB)
            else:
                self.union_to(rootB, rootA)
                if self.rank[rootA] == self.rank[rootB]:
                    self.rank[rootA] += 1

    def union_to(self, source, dest):
        self.parent[source] = dest

    def judge(self, A, B):
        return self.root(A) == self.root(B)

    def get_set(self, id_):
        return {i for i in range(self.size) if self.judge(i, id_)}

    def root(self, id_):
        if self.parent[id_] == id_:
            return id_
        self.parent[id_] = self.root(self.parent[id_])
        return self.parent[id_]

class PrimeNumberUtils:
    def __init__(self, limit):
        if limit > 10000000:
            print("Upper limit is too high, initialization may TLE", file=sys.stderr)
        self.primes = []
        self.is_prime_array = [False] * limit
        if limit > 2:
            self.primes.append(2)
            self.is_prime_array[2] = True

        for i in range(3, limit, 2):
            if self.is_prime(i):
                self.primes.append(i)
                self.is_prime_array[i] = True

    def get_prime_number_list(self):
        return self.primes

    def is_prime(self, n):
        return self.is_prime_array[n]

    def is_prime(self, n, primes):
        for prime in primes:
            if n % prime == 0:
                return False
            if prime > math.sqrt(n):
                break
        return True

class LongBit:
    def __init__(self, size):
        self.bit_array = [0] * ((size + 63) // 64)

    def set(self, index, bit):
        segment = index // 64
        in_index = index % 64
        if bit:
            self.bit_array[segment] |= 1 << in_index
        else:
            self.bit_array[segment] &= ~(1 << in_index)

    def get(self, index):
        segment = index // 64
        in_index = index % 64
        return (self.bit_array[segment] & (1 << in_index)) != 0

    def shift_right(self, num):
        shift_seg = num // 64
        shift_in_i = num % 64
        for segment in range(len(self.bit_array)):
            source_seg = segment + shift_seg
            if source_seg < len(self.bit_array):
                self.bit_array[segment] = self.bit_array[source_seg] >> shift_in_i
                if shift_in_i > 0 and source_seg + 1 < len(self.bit_array):
                    self.bit_array[segment] |= self.bit_array[source_seg + 1] << (64 - shift_in_i)
            else:
                self.bit_array[segment] = 0

    def shift_left(self, num):
        shift_seg = num // 64
        shift_in_i = num % 64
        for segment in range(len(self.bit_array) - 1, -1, -1):
            source_seg = segment - shift_seg
            if source_seg >= 0:
                self.bit_array[segment] = self.bit_array[source_seg] << shift_in_i
                if shift_in_i > 0 and source_seg > 0:
                    self.bit_array[segment] |= self.bit_array[source_seg - 1] >> (64 - shift_in_i)
            else:
                self.bit_array[segment] = 0

    def get_long(self, segment):
        return self.bit_array[segment]

    def or_(self, bitset):
        if not isinstance(bitset, LongBit):
            return
        for segment in range(len(self.bit_array)):
            self.bit_array[segment] |= bitset.get_long(segment)

    def and_(self, bitset):
        if not isinstance(bitset, LongBit):
            return
        for segment in range(len(self.bit_array)):
            self.bit_array[segment] &= bitset.get_long(segment)

if __name__ == "__main__":
    main = Main()
    main.main()

