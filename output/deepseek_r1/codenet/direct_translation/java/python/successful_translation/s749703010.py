
from functools import lru_cache
import sys

def main():
    sys.setrecursionlimit(1 << 25)
    n = int(sys.stdin.readline())
    a0 = list(map(int, sys.stdin.readline().split()))
    a1 = list(map(int, sys.stdin.readline().split()))
    a = [a0, a1]

    @lru_cache(maxsize=None)
    def dp(fliped, idx, msk):
        if msk == (1 << n) - 1:
            return 0
        x_initial = bin(msk).count('1')
        x = x_initial
        ff = 0
        ans = float('inf')
        for i in range(n):
            if not (msk & (1 << i)):
                nf_val = x % 2
                new_fliped = (nf_val + (ff % 2)) % 2
                if idx == n or a[fliped][idx] <= a[new_fliped][i]:
                    new_msk = msk | (1 << i)
                    res = ff + dp(new_fliped, i, new_msk)
                    ans = min(ans, res)
                ff += 1
            else:
                x -= 1
        return ans if ans != float('inf') else 10**18

    result = dp(0, n, 0)
    print(-1 if result >= 10**18 else result)

if __name__ == "__main__":
    main()

