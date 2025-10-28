
import sys
import math
from collections import deque
from bisect import bisect_left, bisect_right

mod = int(1e9 + 7)
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
inf = sys.maxsize // 2
linf = sys.maxsize // 3
dinf = float('inf') / 3
eps = 1e-10
pi = math.pi
sb = []

def solve():
    tmp = ns()
    s = list(tmp)
    n = len(s)
    ans = 0
    cnt = 0
    for i in range(n):
        if s[i] == 'S':
            cnt += 1
        else:
            if cnt == 0:
                continue
            ans += 1
            cnt -= 1
    print(n - 2 * ans)

def reverse(ar):
    return ar[::-1]

def getReverse(s):
    return s[::-1]

def sbnl():
    sb.append("\n")

def lowerBound(a, x):
    return bisect_left(a, x)

def upperBound(a, x):
    return bisect_right(a, x)

def rlowerBound(a, x):
    return len(a) - bisect_right(a[::-1], x)

def rupperBound(a, x):
    return len(a) - bisect_left(a[::-1], x)

def concat(x, arr):
    return [x] + arr

def concat(arr, x):
    return arr + [x]

def max(x, y, z=None):
    if z is None:
        return max(x, y)
    return max(x, y, z)

def min(x, y, z=None):
    if z is None:
        return min(x, y)
    return min(x, y, z)

def sort(ar):
    ar.sort()

def rsort(ar):
    ar.sort(reverse=True)

def fill(arr, x):
    for i in range(len(arr)):
        arr[i] = x

def plus(x, y):
    res = (x + y) % mod
    return res if res >= 0 else res + mod

def sub(x, y):
    res = (x - y) % mod
    return res if res >= 0 else res + mod

def mul(x, y):
    res = (x * y) % mod
    return res if res >= 0 else res + mod

def div(x, y):
    res = x * pow(y, mod - 2, mod) % mod
    return res if res >= 0 else res + mod

def pow(x, y):
    if y < 0:
        return 0
    return pow(x, y, mod)

def ns():
    return input().strip()

def nm(n, m):
    return [list(ns()) for _ in range(n)]

def na(n):
    return list(map(int, input().strip().split()))

def nla(n):
    return list(map(int, input().strip().split()))

def ni():
    return int(input().strip())

def nl():
    return int(input().strip())

if __name__ == "__main__":
    solve()

