
import sys
import math
import random
import bisect

class UnionFind:
    def __init__(self, n):
        self.Parent = [-1] * n

    def root(self, A):
        if self.Parent[A] < 0:
            return A
        self.Parent[A] = self.root(self.Parent[A])
        return self.Parent[A]

    def size(self, A):
        return -self.Parent[self.root(A)]

    def connect(self, A, B):
        A = self.root(A)
        B = self.root(B)
        if A == B:
            return False
        if self.size(A) < self.size(B):
            A, B = B, A
        self.Parent[A] += self.Parent[B]
        self.Parent[B] = A
        return True

def main():
    str = input()
    print("Yes" if str[2] == str[3] and str[4] == str[5] else "No")

def lower_bound(a, key):
    right = len(a)
    left = 0
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a, key):
    right = len(a)
    left = 0
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] <= key:
            left = mid
        else:
            right = mid
    return left

def is_prime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    d = math.isqrt(n)
    for i in range(3, d + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def set_array(a):
    return [int(input()) for _ in range(a)]

def lset_array(a):
    return [int(input()) for _ in range(a)]

def reverse(str):
    return str[::-1]

def print_array(que):
    print(' '.join(map(str, que)))

def double_sort(a):
    a.sort(key=lambda x: x[0])
    return a

def ldouble_sort(a):
    a.sort(key=lambda x: x[0])
    return a

def modpow(x, n, mo):
    sum = 1
    while n > 0:
        if n & 1:
            sum = sum * x % mo
        x = x * x % mo
        n >>= 1
    return sum

def revch(ch):
    return ch[::-1]

def revint(ch):
    return ch[::-1]

def warshall_floyd(v, n):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

def modint(a, m):
    b, u, v = m, 1, 0
    while b != 0:
        t = a // b
        a -= t * b
        a, b = b, a
        u -= t * v
        u, v = v, u
    u %= m
    if u < 0:
        u += m
    return u

if __name__ == "__main__":
    main()

