
import sys

def main():
    n, X = map(int, sys.stdin.readline().split())
    x = list(map(int, sys.stdin.readline().split()))
    xsum = [0] * (n + 1)
    for i in range(n):
        xsum[i+1] = xsum[i] + x[i]
    ans = X * n + 5 * xsum[n]
    for i in range(1, n):
        cost = X * i + 5 * (xsum[n] - xsum[n - i])
        j = 5
        k = n - i
        while k >= 0:
            if cost > ans:
                break
            prev_k = max(k - i, 0)
            cost += j * (xsum[k] - xsum[prev_k])
            j += 2
            k -= i
        ans = min(ans, cost)
    print(ans + n * X)

if __name__ == "__main__":
    main()

