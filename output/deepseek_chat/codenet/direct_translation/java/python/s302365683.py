
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline())
    hm = defaultdict(int)
    for val in map(int, sys.stdin.readline().split()):
        hm[val] += 1
    ans = 0
    for val, num in hm.items():
        if num > val:
            ans += num - val
        elif num < val:
            ans += num
    print(ans)

if __name__ == "__main__":
    main()

