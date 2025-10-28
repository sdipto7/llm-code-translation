
import sys
sys.setrecursionlimit(1 << 25)

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    a = [list(map(int, input[ptr:ptr+n])), list(map(int, input[ptr+n:ptr+2*n]))]
    
    memo = [[[-1]*(1<<n) for _ in range(n+1)] for __ in range(2)]
    
    def dp(flipped, idx, msk):
        if msk == (1<<n)-1:
            return 0
        if memo[flipped][idx][msk] != -1:
            return memo[flipped][idx][msk]
        
        x = bin(msk).count('1')
        ff = 0
        ans = 10**18
        temp_x = x
        
        for i in range(n):
            if not (msk & (1 << i)):
                nf = temp_x % 2
                new_flip = (nf + (ff % 2)) % 2
                if idx == n or a[flipped][idx] <= a[new_flip][i]:
                    res = ff + dp(new_flip, i, msk | (1<<i))
                    ans = min(ans, res)
                ff += 1
            else:
                temp_x -= 1
        
        memo[flipped][idx][msk] = ans
        return ans
    
    result = dp(0, n, 0)
    print(-1 if result >= 1e8 else result)

if __name__ == "__main__":
    main()

