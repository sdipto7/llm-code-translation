
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))
    if n == 1:
        a = [int(sys.stdin.readline().strip())]
    cost1 = 0
    cost2 = 0
    current1 = 0
    current2 = 0
    dp1 = [0] * n
    dp2 = [0] * n
    for i in range(n):
        cost1 += abs(a[i] - current1)
        current1 = a[i]
        dp1[i] = cost1
    for j in range(n-1, -1, -1):
        cost2 += abs(a[j] - current2)
        current2 = a[j]
        dp2[j] = cost2

    for i in range(n):
        if i == 0:
            print(dp2[i + 1] + abs(0 - a[i + 1]) if i + 1 < n else 0)
        elif i == n - 1:
            print(dp1[i - 1] + abs(a[i - 1] - 0))
        else:
            print(dp1[i - 1] + dp2[i + 1] + abs(a[i - 1] - a[i + 1]))

if __name__ == "__main__":
    main()

