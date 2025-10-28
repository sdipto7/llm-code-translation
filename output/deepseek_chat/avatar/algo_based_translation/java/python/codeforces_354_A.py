
import sys

def main():
    data = sys.stdin.read().split()
    it = iter(data)
    N = int(next(it))
    L = int(next(it))
    R = int(next(it))
    QL = int(next(it))
    QR = int(next(it))
    
    W = [0] * N
    sum_arr = [0] * (N + 1)
    
    for n in range(N):
        W[n] = int(next(it))
        sum_arr[n + 1] = sum_arr[n] + W[n]
    
    min_val = float('inf')
    
    for firstR in range(N + 1):
        lCount = firstR
        rCount = N - lCount
        cand = sum_arr[lCount] * L + (sum_arr[N] - sum_arr[lCount]) * R
        
        llCount = max(0, lCount - rCount - 1)
        rrCount = max(0, rCount - lCount - 1)
        
        cand += llCount * QL
        cand += rrCount * QR
        
        min_val = min(min_val, cand)
    
    print(min_val)

if __name__ == "__main__":
    main()

