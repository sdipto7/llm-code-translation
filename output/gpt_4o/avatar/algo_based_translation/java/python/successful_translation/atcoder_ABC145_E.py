
import sys
import numpy as np

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    N = int(data[index])
    index += 1
    T = int(data[index])
    index += 1
    
    AB = []
    for i in range(N):
        a = int(data[index])
        index += 1
        b = int(data[index])
        index += 1
        AB.append((a, b))
        
    AB.sort(key=lambda x: x[0])
    
    dp = np.zeros((N + 1, 6001), dtype=int)
    
    for i in range(1, N + 1):
        time, value = AB[i - 1]
        for timeAfterEat in range(6001):
            dp[i][timeAfterEat] = max(dp[i][timeAfterEat], dp[i - 1][timeAfterEat])
            if 0 <= timeAfterEat - time < T:
                dp[i][timeAfterEat] = max(dp[i][timeAfterEat], dp[i - 1][timeAfterEat - time] + value)
    
    print(max(dp[N]))

if __name__ == "__main__":
    main()

