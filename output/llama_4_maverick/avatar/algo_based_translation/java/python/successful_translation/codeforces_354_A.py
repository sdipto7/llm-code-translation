
def main():
    N, L, R, QL, QR = map(int, input().split())
    W = list(map(int, input().split()))
    sum_array = [0] * (N + 1)
    for n in range(N):
        sum_array[n + 1] = sum_array[n] + W[n]
    min_value = float('inf')
    for firstR in range(N + 1):
        lCount = firstR
        rCount = N - lCount
        cand = sum_array[lCount] * L + (sum_array[N] - sum_array[lCount]) * R
        llCount = max(0, lCount - rCount - 1)
        rrCount = max(0, rCount - lCount - 1)
        cand += llCount * QL + rrCount * QR
        min_value = min(cand, min_value)
    print(min_value)

if __name__ == "__main__":
    main()

