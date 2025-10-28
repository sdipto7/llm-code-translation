
import sys

def solve():
    n = int(sys.stdin.readline())
    lst = list(map(int, sys.stdin.readline().split()))[:n]
    max_val = 0
    count = 0
    for num in lst:
        if num >= max_val:
            max_val = num
            count += 1
    print(count)

if __name__ == "__main__":
    solve()

