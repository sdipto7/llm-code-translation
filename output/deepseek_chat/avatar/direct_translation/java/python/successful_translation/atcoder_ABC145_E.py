
import sys
import itertools

def main():
    sc = sys.stdin
    N, T = map(int, sc.readline().split())
    AB = [tuple(map(int, sc.readline().split())) for _ in range(N)]
    AB.sort()
    dp = [[0] * 6001 for _ in range(N+1)]
    for i in range(1, N+1):
        for timeAfterEat in range(6001):
            dp[i][timeAfterEat] = max(dp[i][timeAfterEat], dp[i-1][timeAfterEat])
            time, value = AB[i-1]
            if 0 <= timeAfterEat - time < T:
                dp[i][timeAfterEat] = max(dp[i][timeAfterEat], dp[i-1][timeAfterEat - time] + value)
    print(max(dp[N]))

if __name__ == "__main__":
    main()

