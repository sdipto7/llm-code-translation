
import sys
import math
import sys
import math as mt

def main():
    input = sys.stdin.read
    data = input().split()
    idx = 0
    t = int(data[idx])
    idx +=1
    for _ in range(t):
        n = int(data[idx])
        m = int(data[idx+1])
        idx +=2
        if n == 0:
            print(0)
        elif n == m:
            print(0)
        elif n > m:
            n =  n % m
            n = n - m
            print(min(m - n, n))
        else:
            print(min(m - n, n))

def swap(chrr, i, j):
    chrr[i], chrr[j] = chrr[j], chrr[i]

def num(n):
    a = 0
    while n > 0:
        a += (n & 1)
        n >>=1
    return a

class Pair:
    def __init__(self, a, b, i):
        self.u = a
        self.v = b
        self.i = i

def isPrime(n):
    if n <= 1:
        return False
    elif n <= 3:
        return True
    elif n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b) if a > b else gcd(a, b % a)

def fast_pow(base, n, M):
    if n == 0:
        return 1
    elif n == 1:
        return base
    halfn = fast_pow(base, n // 2, M)
    if n % 2 == 0:
        return (halfn * halfn) % M
    else:
        return (((halfn * halfn) % M) * base) % M

def modInverse(n, M):
    return fast_pow(n, M - 2, M)

def feedArr(arr, sc):
    for i in range(len(arr)):
        arr[i] = int(sc.next())

def feedArr_double(arr, sc):
    for i in range(len(arr)):
        arr[i] = float(sc.next())

def printArr_int(arr):
    return ' '.join(map(str, arr))

def printArr_long(arr):
    return ' '.join(map(str, arr))

def printArr_str(arr):
    return ' '.join(map(str, arr))

def printArr_double(arr):
    return ' '.join(map(str, arr))

if __name__ == '__main__':
    main()

