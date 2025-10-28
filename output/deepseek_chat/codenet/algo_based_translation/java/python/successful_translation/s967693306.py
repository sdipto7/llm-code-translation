
import sys
import math
from collections import defaultdict

MOD = 10**9 + 7

class FastScanner:
    def __init__(self):
        self.buffer = []
    
    def next(self):
        while not self.buffer:
            self.buffer = sys.stdin.read().split()
        return self.buffer.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())

class Main:
    def __init__(self):
        self.sc = FastScanner()
    
    def solve(self):
        n = self.sc.next_int()
        m = self.sc.next_int()
        constraints = {}
        
        for _ in range(m):
            s = self.sc.next_int()
            c = self.sc.next_int()
            if s in constraints and constraints[s] != c:
                print(-1)
                return
            constraints[s] = c
        
        for num in range(1000):
            s = str(num)
            if len(s) < n:
                continue
            
            valid = True
            for j in range(len(s)):
                pos = j + 1
                if pos in constraints:
                    if int(s[j]) != constraints[pos]:
                        valid = False
                        break
                else:
                    if int(s[j]) != 0:
                        if j == 0 and int(s[j]) == 1:
                            continue
                        valid = False
                        break
            
            if valid and len(s) == n:
                print(s)
                return
        
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
        result = 1
        a %= MOD
        while r > 0:
            if r & 1:
                result = (result * a) % MOD
            a = (a * a) % MOD
            r >>= 1
        return result
    
    def mod_fact(self, n):
        if n == 0:
            return 1
        return (n * self.mod_fact(n - 1)) % MOD
    
    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)
    
    def init_comb(self, size):
        self.fac = [0] * size
        self.inv_arr = [0] * size
        self.finv = [0] * size
        self.fac[0] = self.fac[1] = 1
        self.inv_arr[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, size):
            self.fac[i] = self.fac[i - 1] * i % MOD
            self.inv_arr[i] = MOD - self.inv_arr[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv_arr[i] % MOD
    
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
        for i in range(2, int(math.isqrt(a)) + 1):
            if a % i == 0:
                return False
        return True
    
    def next_permutation_str(self, s):
        chars = list(s)
        pivot_pos = -1
        pivot = 0
        for i in range(len(chars) - 2, -1, -1):
            if chars[i] < chars[i + 1]:
                pivot_pos = i
                pivot = chars[i]
                break
        
        if pivot_pos == -1:
            return None
        
        min_pos = -1
        min_char = chr(127)
        for i in range(len(chars) - 1, pivot_pos, -1):
            if pivot < chars[i]:
                if chars[i] < min_char:
                    min_char = chars[i]
                    min_pos = i
        
        chars[pivot_pos], chars[min_pos] = chars[min_pos], chars[pivot_pos]
        chars[pivot_pos + 1:] = sorted(chars[pivot_pos + 1:])
        return ''.join(chars)
    
    def next_permutation_arr(self, arr):
        for i in range(len(arr) - 1, 0, -1):
            if arr[i - 1] < arr[i]:
                swap_index = self.find(arr[i - 1], arr, i, len(arr) - 1)
                arr[swap_index], arr[i - 1] = arr[i - 1], arr[swap_index]
                arr[i:] = sorted(arr[i:])
                return True
        return False
    
    def find(self, dest, arr, start, end):
        if start == end:
            return start
        mid = (start + end + 1) // 2
        if arr[mid] <= dest:
            return self.find(dest, arr, start, mid - 1)
        else:
            return self.find(dest, arr, mid, end)
    
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
    def __init__(self, a, b):
        self.a = a
        self.b = b
    
    def __lt__(self, other):
        return self.b < other.b

if __name__ == '__main__':
    main = Main()
    main.solve()

