
import sys

sc = sys.stdin

def read():
    try:
        global d
        d = int(sc.readline())
        return True
    except:
        return False

def solve():
    ans = 0
    for i in range(1, 600 // d):
        x = i * d
        y = x * x
        ans += y * d
    return ans

while read():
    print(solve())

