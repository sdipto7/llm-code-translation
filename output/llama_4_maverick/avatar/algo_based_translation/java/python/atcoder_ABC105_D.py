from collections import defaultdict

def main():
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    dp = defaultdict(int)
    base = 0
    ans = 0
    for i in range(n):
        base = (base - a[i] % m + m) % m
        ans += dp[base]
        dp[(base + a[i]) % m] += 1
    print(ans)

if __name__ == "__main__":
    main()
