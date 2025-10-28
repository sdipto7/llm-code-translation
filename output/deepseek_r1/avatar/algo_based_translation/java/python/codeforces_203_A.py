
import sys

def solve():
    x, t, a, b, da, db = map(int, sys.stdin.readline().split())
    ok = False
    for i in range(t):
        first = a - da * i
        for j in range(t):
            second = b - db * j
            if (first + second == x) or (second == x) or (first == x) or (x == 0):
                ok = True
                break
    print("YES" if ok else "NO")

if __name__ == "__main__":
    solve()

