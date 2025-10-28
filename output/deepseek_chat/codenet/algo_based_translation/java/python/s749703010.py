
import sys
import sys
sys.setrecursionlimit(1000000)

class Pair:
    def __init__(self, a, b):
        self.l = a
        self.r = b
    
    def __str__(self):
        return f"{self.l} {self.r}"

def bit_count(x):
    return bin(x).count('1')

def dp(fliped, idx, msk):
    global memo, a, n
    if msk == (1 << n) - 1:
        return 0
    if memo[fliped][idx][msk] != -1:
        return memo[fliped][idx][msk]
    
    x = bit_count(msk)
    ff = 0
    ans = 10**9
    
    for i in range(n):
        if (msk & (1 << i)) == 0:
            nf = x % 2
            if idx == n or a[fliped][idx] <= a[(nf + (ff % 2)) % 2][i]:
                candidate = ff + dp((nf + (ff % 2)) % 2, i, msk | (1 << i))
                if candidate < ans:
                    ans = candidate
            ff += 1
        else:
            x -= 1
    
    memo[fliped][idx][msk] = ans
    return ans

def main():
    global memo, a, n
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    a = [[0]*n for _ in range(2)]
    
    index = 1
    for i in range(n):
        a[0][i] = int(data[index])
        index += 1
    for i in range(n):
        a[1][i] = int(data[index])
        index += 1
    
    memo = [[[-1] * (1 << n) for _ in range(n+1)] for __ in range(2)]
    
    result = dp(0, n, 0)
    if result >= 10**8:
        print(-1)
    else:
        print(result)

if __name__ == '__main__':
    main()

