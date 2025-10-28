
from collections import defaultdict
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    a = list(map(int, sys.stdin.readline().split()))
    dp = defaultdict(int)
    ans = 0
    base = 0
    for num in a:
        base = (base - (num % m) + m) % m
        key = (base + num) % m
        dp[key] += 1
        ans += dp.get(base, 0)
    print(ans)

if __name__ == "__main__":
    main()

