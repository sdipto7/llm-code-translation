
import sys

def main():
    import sys
    from sys import stdin
    input = stdin.read().split()
    
    max_val = 0
    n = int(input[0])
    beacon = [0] * 1000001
    dp = [0] * 1000001
    
    index = 1
    for i in range(n):
        a = int(input[index])
        beacon[a] = int(input[index + 1])
        index += 2
    
    if beacon[0] != 0:
        dp[0] = 1
    
    for i in range(1, 1000001):
        if beacon[i] != 0 and beacon[i] < i:
            dp[i] = dp[i - beacon[i] - 1] + 1
        elif beacon[i] != 0:
            dp[i] = 1
        else:
            dp[i] = dp[i - 1]
        max_val = max(max_val, dp[i])
    
    print(n - max_val)

if __name__ == "__main__":
    main()

