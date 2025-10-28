
import sys

def read():
    global d
    if not sys.stdin.readable():
        return False
    try:
        d = int(input().strip())
        return True
    except EOFError:
        return False

def solve():
    ans = 0
    i = 1
    while i * d < 600:
        x = i * d
        y = x * x
        ans += y * d
        i += 1
    return ans

if __name__ == "__main__":
    while read():
        print(solve())

