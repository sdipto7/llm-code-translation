
import sys
from collections import defaultdict

def isPossible(k, a):
    s = defaultdict(int)
    current = 0
    for ai in a:
        if ai <= current:
            if k == 1:
                return False
            for key in sorted(s.keys(), reverse=True):
                if key >= ai:
                    del s[key]
                else:
                    break
            p = ai - 1
            while True:
                if p < 0:
                    return False
                s[p] += 1
                if s[p] == k:
                    del s[p]
                    p -= 1
                else:
                    break
        current = ai
    return True

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))

    ng = 0
    ok = n
    while ok - ng > 1:
        k = (ng + ok) // 2
        if isPossible(k, a):
            ok = k
        else:
            ng = k
    print(ok)

if __name__ == "__main__":
    main()

