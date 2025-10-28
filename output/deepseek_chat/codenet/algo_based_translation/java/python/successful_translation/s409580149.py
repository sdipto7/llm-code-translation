
import sys
import math
import array
import collections
import functools

sys.setrecursionlimit(1000000)
MOD = 10**9 + 7

def main():
    n = int(input().strip())
    a = list(map(int, input().split()))
    
    dp = [[[-1.0] * (n+1) for _ in range(n+1)] for __ in range(n+1)]
    dp[0][0][0] = 0.0
    
    cnt = [0, 0, 0]
    for num in a:
        cnt[num-1] += 1
    
    @functools.lru_cache(maxsize=None)
    def rec(i, j, k):
        if dp[i][j][k] != -1:
            return dp[i][j][k]
        
        total = i + j + k
        p = total / n
        pi = i / n
        pj = j / n
        pk = k / n
        
        ret = 1.0 / p
        
        if i > 0:
            ret += (pi / p) * rec(i-1, j, k)
        if j > 0:
            ret += (pj / p) * rec(i+1, j-1, k)
        if k > 0:
            ret += (pk / p) * rec(i, j+1, k-1)
        
        dp[i][j][k] = ret
        return ret
    
    result = rec(cnt[0], cnt[1], cnt[2])
    print(f"{result:.10f}")

if __name__ == "__main__":
    main()

