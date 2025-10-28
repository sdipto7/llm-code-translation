
import sys

sc = iter(sys.stdin.read().split())
d = 0

def read():
    global d
    try:
        token = next(sc)
        d = int(token)
        return True
    except (StopIteration, ValueError):
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

def main():
    while read():
        result = solve()
        print(result)

if __name__ == "__main__":
    main()

