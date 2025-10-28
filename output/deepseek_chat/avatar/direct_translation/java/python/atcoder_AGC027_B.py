
INF = float('inf')

def main():
    import sys
    N, X = map(int, sys.stdin.readline().split())
    x = list(map(int, sys.stdin.readline().split()))
    xsum = [0] * (N + 1)
    for i in range(N):
        xsum[i + 1] = xsum[i] + x[i]
    ans = X * N + 5 * xsum[N]
    for i in range(1, N):
        cost = X * i + 5 * (xsum[N] - xsum[N - i])
        j, k = 5, N - i
        while k >= 0:
            if cost > ans:
                break
            add = (xsum[k] - xsum[max(k - i, 0)]) if k - i >= 0 else 0
            cost += (j + 2 * ((N - k) // i)) * add
            j += 2
            k -= i
        ans = min(ans, cost)
    print(ans + N * X)

if __name__ == "__main__":
    main()

