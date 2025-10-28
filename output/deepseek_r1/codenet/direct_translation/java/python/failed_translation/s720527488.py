
import sys

def main():
    m, n = map(int, sys.stdin.readline().split())
    manju = list(map(int, sys.stdin.readline().split()))
    manju.sort(reverse=True)
    prefix_sum = [0] * (m + 1)
    for k in range(m):
        prefix_sum[k+1] = prefix_sum[k] + manju[k]
    box_lengths = []
    box_costs = []
    for _ in range(n):
        l, c = map(int, sys.stdin.readline().split())
        box_lengths.append(l)
        box_costs.append(c)
    dp = [[0]*(n+1) for _ in range(m+1)]
    for i in range(m-1, -1, -1):
        for j in range(n-1, -1, -1):
            len_val = min(i + box_lengths[j], m)
            cnt = prefix_sum[len_val] - prefix_sum[i]
            take = dp[len_val][j+1] + cnt - box_costs[j]
            not_take = dp[i][j+1]
            dp[i][j] = max(take, not_take)
    print(dp[0][0])

if __name__ == '__main__':
    main()

