
def main():
    import sys
    from sys import stdin
    
    input = stdin.read().split()
    
    N = int(input[0])
    L = int(input[1])
    R = int(input[2])
    QL = int(input[3])
    QR = int(input[4])
    
    W = [0] * N
    sum = [0] * (N + 1)
    
    index = 5
    for n in range(N):
        W[n] = int(input[index])
        sum[n + 1] = sum[n] + W[n]
        index += 1
    
    min_value = float('inf')
    
    for firstR in range(N + 1):
        lCount = firstR
        rCount = N - lCount
        cand = sum[lCount] * L + (sum[N] - sum[lCount]) * R
        llCount = max(0, lCount - rCount - 1)
        rrCount = max(0, rCount - lCount - 1)
        cand += llCount * QL
        cand += rrCount * QR
        min_value = min(cand, min_value)
    
    print(min_value)

if __name__ == "__main__":
    main()

