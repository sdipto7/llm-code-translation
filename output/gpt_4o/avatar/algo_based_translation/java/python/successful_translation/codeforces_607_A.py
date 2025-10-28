
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    max_value = 0
    n = int(data[0])
    beacon = [0] * 1000001
    dp = [0] * 1000001
    
    index = 1
    for _ in range(n):
        a = int(data[index])
        beacon[a] = int(data[index + 1])
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
        
        max_value = max(max_value, dp[i])
    
    print(n - max_value)

if __name__ == "__main__":
    main()

