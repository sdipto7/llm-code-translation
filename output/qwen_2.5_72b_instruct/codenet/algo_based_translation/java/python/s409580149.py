
import sys
import math

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
    if dp[i][j][k] != -1:
        return dp[i][j][k]
    ret = 0
    p = (i + j + k) / n
    pi = i / n
    pj = j / n
    pk = k / n
    ret += 1 / p
    if i > 0:
        ret += (pi / p) * rec(i - 1, j, k)
    if j > 0:
        ret += (pj / p) * rec(i + 1, j - 1, k)
    if k > 0:
        ret += (pk / p) * rec(i, j + 1, k - 1)
    dp[i][j][k] = ret
    return ret

def reverse(ar):
    ar.reverse()

def getReverse(s):
    return s[::-1]

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

def concat(x, arr):
    return [x] + arr

def max(*args):
    return max(*args)

def min(*args):
    return min(*args)

def sort(ar):
    ar.sort()

def fill(arr, x):
    for i in range(len(arr)):
        arr[i] = x

def main():
    global is_, out
    is_ = sys.stdin.read().split()
    out = []
    solve()
    print("\n".join(map(str, out)))

def ni():
    return int(is_.pop(0))

def na(n):
    return [ni() for _ in range(n)]

if __name__ == "__main__":
    main()

