
import sys
import math
from collections import deque

n = 0
a = []
dp = []

def solve():
    global n, a, dp
    n = ni()
    a = na(n)
    dp = [[[-1] * (n + 1) for _ in range(n + 1)] for _ in range(n + 1)]
    dp[0][0][0] = 0
    cnt = [0] * 3
    for i in range(n):
        cnt[a[i] - 1] += 1
    ans = rec(cnt[0], cnt[1], cnt[2])
    print(ans)

def rec(i, j, k):
    global dp
    if dp[i][j][k] != -1:
        return dp[i][j][k]
    ret = 0
    p = (i + j + k) / n
    pi = i / n
    pj = j / n
    pk = k / n
    ret += 1 / p
    if i > 0:
        ret += pi / p * rec(i - 1, j, k)
    if j > 0:
        ret += pj / p * rec(i + 1, j - 1, k)
    if k > 0:
        ret += pk / p * rec(i, j + 1, k - 1)
    dp[i][j][k] = ret
    return ret

def reverse(ar):
    ar.reverse()

def lowerBound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] < x:
            l = c
        else:
            r = c
    return r

def upperBound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] <= x:
            l = c
        else:
            r = c
    return r

def fill(arr, x):
    for i in range(len(arr)):
        arr[i] = x

def fill2d(arr, x):
    for i in range(len(arr)):
        fill(arr[i], x)

def ni():
    s = sys.stdin.read(1)
    while s.isspace():
        s = sys.stdin.read(1)
    sign = -1 if s == '-' else 1
    if sign == -1:
        s = sys.stdin.read(1)
    res = 0
    while not s.isspace():
        res *= 10
        res += ord(s) - 48
        s = sys.stdin.read(1)
    return sign * res

def na(n):
    res = [0] * n
    for i in range(n):
        res[i] = ni()
    return res

if __name__ == "__main__":
    solve()

