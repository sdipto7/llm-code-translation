
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    X = int(data[1])
    x = list(map(int, data[2:2+N]))
    xsum = [0] * (N + 1)
    for i in range(N):
        xsum[i+1] = xsum[i] + x[i]
    ans = X * N + 5 * xsum[N]
    for i in range(1, N):
        cost = X * i + 5 * (xsum[N] - xsum[N - i])
        j = 5
        k = N - i
        while k >= 0:
            if cost > ans:
                break
            cost += j * (xsum[k] - xsum[max(k - i, 0)])
            j += 2
            k -= i
        ans = min(ans, cost)
    print(ans + N * X)

if __name__ == "__main__":
    main()

