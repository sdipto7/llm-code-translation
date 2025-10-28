
import sys
import io
from collections import deque
import bisect

mod = int(1e9 + 7)
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
inf = sys.maxsize // 2
linf = sys.maxsize // 3
dinf = float('inf') / 3
eps = 1e-10
pi = 3.141592653589793
sb = []

def reverse_list(ar):
    return ar[::-1]

def get_reverse(s):
    return s[::-1]

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

def lower_bound(a, x):
    return bisect.bisect_left(a, x)

def upper_bound(a, x):
    return bisect.bisect_right(a, x)

def rlower_bound(a, x):
    return len(a) - bisect.bisect_right(a, x)

def rupper_bound(a, x):
    return len(a) - bisect.bisect_left(a, x)

def concat(x, arr):
    return [x] + arr

def concat_arr(arr, x):
    return arr + [x]

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
    if y == 0:
        return 1
    if y % 2 == 1:
        return (x * pow(x, y - 1)) % mod
    root = pow(x, y // 2)
    return root * root % mod

def ns():
    return sys.stdin.readline().strip()

def ni():
    return int(ns())

def main():
    solve()

if __name__ == "__main__":
    sys.stdin = io.StringIO(sys.stdin.read() if len(sys.argv) == 1 else sys.argv[1])
    main()

