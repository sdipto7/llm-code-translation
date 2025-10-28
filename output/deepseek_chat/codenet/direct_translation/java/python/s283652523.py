


import sys

MOD = 10**9 + 7

def main():
    N = int(sys.stdin.readline())
    A = list(map(int, sys.stdin.readline().split()))
    
    ans = 0
    sum_val = A[-1]
    for i in range(N-2, -1, -1):
        ans = (ans + (sum_val * A[i]) % MOD) % MOD
        sum_val = (sum_val + A[i]) % MOD
    print(ans)

if __name__ == "__main__":
    main()

