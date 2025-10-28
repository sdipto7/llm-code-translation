
import sys
sys.setrecursionlimit(1 << 25)

MOD = 10**9 + 7

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    N = int(input[ptr])
    ptr += 1
    to = [[] for _ in range(N)]
    edges = []
    for _ in range(N-1):
        A = int(input[ptr])-1
        B = int(input[ptr+1])-1
        ptr +=2
        to[A].append(B)
        to[B].append(A)
        edges.append((A, B))
    
    dp = [0] * N

    def rec(v, parent):
        res = 1
        for u in to[v]:
            if u == parent:
                continue
            res += rec(u, v)
        dp[v] = res
        return res
    
    rec(0, -1)

    mulsum = 0
    for a, b in edges:
        if dp[a] > dp[b]:
            child = b
        else:
            child = a
        a_size = dp[child]
        b_size = N - a_size
        term1 = (pow(2, a_size, MOD) - 1) % MOD
        term2 = (pow(2, b_size, MOD) - 1) % MOD
        mul = (term1 * term2) % MOD
        mulsum = (mulsum + mul) % MOD
    
    cases = pow(2, N, MOD)
    PN = (mulsum + (cases - 1)) % MOD
    BN = (N * pow(2, N-1, MOD)) % MOD
    WN = (PN - BN) % MOD
    if WN < 0:
        WN += MOD
    ans = (WN * pow(cases, MOD-2, MOD)) % MOD
    print(ans)

if __name__ == "__main__":
    main()

