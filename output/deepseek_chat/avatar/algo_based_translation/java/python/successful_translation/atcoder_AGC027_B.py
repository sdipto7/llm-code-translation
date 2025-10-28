
import sys

def main():
    INF = float('inf')
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    X = int(data[1])
    x = []
    index = 2
    for i in range(N):
        x.append(int(data[index]))
        index += 1
    
    xsum = [0] * (N + 1)
    for i in range(N):
        xsum[i + 1] = xsum[i] + x[i]
    
    ans = X * N + 5 * xsum[N]
    
    for i in range(1, N):
        cost = X * i + 5 * (xsum[N] - xsum[N - i])
        j = 5
        k = N - i
        while k >= 0:
            if cost > ans:
                break
            segment_sum = xsum[k] - xsum[max(k - i, 0)]
            cost += j * segment_sum
            j += 2
            k -= i
        ans = min(ans, cost)
    
    print(ans + N * X)

if __name__ == "__main__":
    main()

