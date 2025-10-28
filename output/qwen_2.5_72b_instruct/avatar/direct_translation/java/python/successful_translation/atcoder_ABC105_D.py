
import sys
import sys
import sys

class atcoder_ABC105_D:
    @staticmethod
    def main():
        input = sys.stdin.read().split()
        iterator = iter(input)
        n = int(next(iterator))
        m = int(next(iterator))
        a = [int(next(iterator)) for _ in range(n)]
        dp = {}
        ans = 0
        base = 0
        for i in range(n):
            base = (base - a[i] % m + m) % m
            key = (base + a[i]) % m
            dp[key] = dp.get(key, 0) + 1
            ans += dp.get(base, 0)
        print(ans)

if __name__ == "__main__":
    atcoder_ABC105_D.main()

