
import sys
from collections import deque

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    if n == 1:
        print(a[0])
        sys.exit(0)
    a.sort()
    if a[-1] == 0:
        print(0)
        sys.exit(0)
    ans = 0
    while True:
        if len(a) == 1:
            ans = a[0]
            break
        a = func(a)
    print(ans)

def func(A):
    a = A.copy()
    min_val = 0
    i = 0
    while i < len(a):
        if a[i] == 0:
            a.pop(i)
        else:
            if min_val != 0:
                a[i] = a[i] % min_val
                if a[i] == 1:
                    print(1)
                    sys.exit(0)
            else:
                min_val = a[i]
            i += 1
    a.sort()
    return a

if __name__ == "__main__":
    main()

