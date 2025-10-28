
import sys

def read():
    global d
    line = sys.stdin.readline().strip()
    if not line.isdigit():
        return False
    d = int(line)
    return True

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

