
import sys
import bisect

def main():
    n = int(sys.stdin.readline())
    nums = [int(sys.stdin.readline()) for _ in range(n)]
    dp = []
    for num in nums:
        idx = bisect.bisect_left(dp, -num, 0, len(dp))
        if idx == len(dp):
            dp.append(-num)
        else:
            dp[idx] = -num
    print(len(dp))

if __name__ == "__main__":
    main()

