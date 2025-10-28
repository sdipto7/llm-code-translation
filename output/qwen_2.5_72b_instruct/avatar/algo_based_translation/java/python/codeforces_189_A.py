
import sys

def main():
    import sys
    import sys
    from sys import stdin
    
    input = stdin.read().split()
    n = int(input[0])
    maxn = 4010
    a = int(input[1])
    b = int(input[2])
    c = int(input[3])
    arr = [a, b, c]
    dp = [float('-inf')] * maxn
    dp[0] = 0
    for i in range(3):
        for j in range(arr[i], len(dp)):
            dp[j] = max(dp[j], dp[j - arr[i]] + 1)
    print(dp[n])

if __name__ == "__main__":
    main()

