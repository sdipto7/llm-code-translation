
import sys

def main():
    in_ = sys.stdin.read().split()
    N = int(in_[0])
    L = int(in_[1])
    R = int(in_[2])
    QL = int(in_[3])
    QR = int(in_[4])
    W = list(map(int, in_[5:5+N]))
    sum_ = [0] * (N + 1)
    for n in range(N):
        sum_[n + 1] = sum_[n] + W[n]
    min_ = float('inf')
    for firstR in range(N + 1):
        lCount = firstR
        rCount = N - lCount
        cand = sum_[lCount] * L + (sum_[N] - sum_[lCount]) * R
        llCount = max(0, lCount - rCount - 1)
        rrCount = max(0, rCount - lCount - 1)
        cand += llCount * QL
        cand += rrCount * QR
        min_ = min(cand, min_)
    print(min_)

if __name__ == "__main__":
    main()

