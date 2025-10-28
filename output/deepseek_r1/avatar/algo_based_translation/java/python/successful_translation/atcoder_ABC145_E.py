
import sys

def main():
    N, T = map(int, sys.stdin.readline().split())
    AB = [tuple(map(int, sys.stdin.readline().split())) for _ in range(N)]
    AB.sort(key=lambda x: x[0])
    dp = [[0] * 6001 for _ in range(N+1)]
    
    for i in range(1, N+1):
        time, value = AB[i-1]
        for time_after in range(6001):
            dp[i][time_after] = dp[i-1][time_after]
            if time_after - time >= 0 and time_after - time < T:
                dp[i][time_after] = max(dp[i][time_after], dp[i-1][time_after - time] + value)
    
    print(max(dp[N]))

if __name__ == "__main__":
    main()

