import sys
import numpy as np

def main():
    data = sys.stdin.read().split()
    idx = 0
    N = int(data[idx]); idx += 1
    T = int(data[idx]); idx += 1
    AB = []
    for i in range(N):
        time_val = int(data[idx]); idx += 1
        value_val = int(data[idx]); idx += 1
        AB.append([time_val, value_val])
    
    AB.sort(key=lambda x: x[0])
    
    dp = np.zeros((N+1, 6001), dtype=int)
    
    for i in range(1, N+1):
        time = AB[i-1][0]
        value = AB[i-1][1]
        for time_after_eat in range(6001):
            dp[i][time_after_eat] = max(dp[i][time_after_eat], dp[i-1][time_after_eat])
            if 0 <= time_after_eat - time < T:
                dp[i][time_after_eat] = max(dp[i][time_after_eat], dp[i-1][time_after_eat - time] + value)
    
    result = np.max(dp[N])
    print(result)

if __name__ == "__main__":
    main()
