
import sys

def read():
    try:
        global d
        d = int(sys.stdin.readline().strip())
        return True
    except ValueError:
        return False

def solve():
    ans = 0
    for i in range(1, 600 // d + 1):
        x = i * d
        y = x * x
        ans += y * d
    return ans

def main():
    while read():
        print(solve())

if __name__ == "__main__":
    main()

