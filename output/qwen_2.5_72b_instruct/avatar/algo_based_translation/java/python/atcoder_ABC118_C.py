
from typing import List

def main():
    import sys
    import sys
    from collections import deque
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    if n == 1:
        print(data[1])
        return
    a = list(map(int, data[1:]))
    a.sort()
    if a[-1] == 0:
        print(0)
        return
    ans = 0
    while True:
        if len(a) == 1:
            ans = a[0]
            break
        a = func(a)
    print(ans)

def func(A: List[int]) -> List[int]:
    a = A[:]
    min_val = 0
    i = 0
    while i < len(a):
        if a[i] == 0:
            del a[i]
        else:
            if min_val != 0:
                a[i] %= min_val
                if a[i] == 1:
                    print(1)
                    exit(0)
            else:
                min_val = a[i]
            i += 1
    a.sort()
    return a

if __name__ == "__main__":
    main()

