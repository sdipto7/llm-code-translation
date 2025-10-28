
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    nums = data[1:n+1]
    cnt = [0] * 21
    for x in nums:
        cnt[x + 10] += 1
    res = 0
    for i in range(10):
        res += cnt[i] * cnt[20 - i]
    res += (cnt[10] * (cnt[10] - 1)) // 2
    print(res)

if __name__ == "__main__":
    main()

