
import sys

def main():
    import sys
    from collections import deque
    import math

    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    ans = 0
    for i in range(1, n-1):
        if a[i] != min(a[i-1], a[i], a[i+1]) and a[i] != max(a[i-1], a[i], a[i+1]):
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()

