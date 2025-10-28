
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline().strip().split()[0])
    hm = defaultdict(int)
    for val in map(int, sys.stdin.readline().strip().split()):
        hm[val] += 1
    ans = 0
    for val, num in hm.items():
        if num > val:
            ans += num - val
        else:
            ans += num
    print(ans)

if __name__ == "__main__":
    main()

