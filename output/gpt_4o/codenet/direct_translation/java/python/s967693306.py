
import sys
from collections import defaultdict

INF = float('inf')
MOD = 1_000_000_007
SIZE = 1_000_000

class Main:
    def __init__(self):
        self.fac = [0] * SIZE
        self.inv = [0] * SIZE
        self.finv = [0] * SIZE
        self.sc = FastScanner()

    def solve(self):
        n = self.sc.next_int()
        m = self.sc.next_int()
        map_dict = {}

        for _ in range(m):
            s = self.sc.next_int()
            c = self.sc.next_int()
            if s in map_dict and map_dict[s] != c:
                print(-1)
                sys.exit(0)
            map_dict[s] = c

        for i in range(1000):
            s = str(i)
            flag = True
            if len(s) < n:
                continue
            for j in range(n):
                if (j+1 in map_dict and map_dict[j+1] != int(s[j])) or (j+1 not in map_dict and int(s[j]) != 0):
                    if j+1 not in map_dict and j == 0 and int(s[j]) == 1:
                        continue
                    flag = False
                    break
            if flag and len(s) == n:
                print(s)
                sys.exit(0)

        print(-1)

    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b // self.gcd(a, b)

    def inv(self, a):
        return self.pow(a, MOD - 2)

    def pow(self, a, r):
        sum = 1
        while r > 0:
            if (r & 1) == 1:
                sum *= a
                sum %= MOD
            a *= a
            a %= MOD
            r >>= 1
        return sum

    def mod_fact(self, n):
        if n == 0:
            return 1
        return n * self.mod_fact(n - 1) % MOD

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def init_comb(self):
        self.fac[0] = self.fac[1] = 1
        self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, SIZE):
            self.fac[i] = self.fac[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def mod_comb(self, n, r):
        if n < r or n < 0 or r < 0:
            return 0
        return self.fac[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def comb(self, n, r):
        num = 1
        for i in range(1, r + 1):
            num = num * (n - i + 1) // i
        return num

    def is_prime(self, a):
        if a <= 1:
            return False
        for i in range(2, int(a**0.5) + 1):
            if a % i == 0:
                return False
        return True

    def next_permutation(self, s):
        list_chars = list(s)

        pivot_pos = -1
        pivot = None
        for i in range(len(list_chars) - 2, -1, -1):
            if list_chars[i] < list_chars[i + 1]:
                pivot_pos = i
                pivot = list_chars[i]
                break

        if pivot_pos == -1 and pivot is None:
            return None

        L = pivot_pos + 1
        R = len(list_chars) - 1

        min_pos = -1
        min_char = chr(255)
        for i in range(R, L - 1, -1):
            if pivot < list_chars[i]:
                if list_chars[i] < min_char:
                    min_char = list_chars[i]
                    min_pos = i

        list_chars[pivot_pos], list_chars[min_pos] = list_chars[min_pos], list_chars[pivot_pos]
        list_chars[L:R + 1] = sorted(list_chars[L:R + 1])

        return ''.join(list_chars)

    def next_permutation_array(self, a):
        for i in range(len(a) - 1, 0, -1):
            if a[i - 1] < a[i]:
                swap_index = self.find(a[i - 1], a, i, len(a) - 1)
                a[i - 1], a[swap_index] = a[swap_index], a[i - 1]
                a[i:] = sorted(a[i:])
                return True
        return False

    def find(self, dest, a, s, e):
        if s == e:
            return s
        m = (s + e + 1) // 2
        return self.find(dest, a, s, m - 1) if a[m] <= dest else self.find(dest, a, m, e)

    def elimination(self, a, b):
        n = len(a)
        for k in range(n - 1):
            for i in range(k + 1, n):
                f = -a[i][k] / a[k][k]
                for j in range(k + 1, n):
                    a[i][j] += f * a[k][j]
                b[i] += f * b[k]
            for i in range(n - 1, -1, -1):
                for j in range(i + 1, n):
                    b[i] -= a[i][j] * b[j]
                b[i] = b[i] / a[i][i]

class Pair:
    def __init__(self, i, j):
        self.a = i
        self.b = j

    def __lt__(self, other):
        return self.b < other.b

    def __eq__(self, other):
        return self.b == other.b

class FastScanner:
    def __init__(self):
        self.in_stream = sys.stdin.buffer
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in_stream.readinto(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or ord('9') < b:
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2**31 or nl > 2**31 - 1:
            raise ValueError
        return int(nl)

    def next_double(self):
        return float(self.next())

if __name__ == "__main__":
    Main().solve()

