
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))
    s = defaultdict(int)
    ng, ok = 0, n
    while ok - ng > 1:
        k = (ng + ok) // 2
        if isPossible(a, k, s):
            ok = k
        else:
            ng = k
    print(ok)

def isPossible(a, k, s):
    s.clear()
    current = 0
    for ai in a:
        if ai <= current:
            if k == 1:
                return False
            while s and max(s) >= ai:
                s
