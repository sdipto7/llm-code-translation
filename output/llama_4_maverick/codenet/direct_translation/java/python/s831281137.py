
import sys

def main():
    N = nint()
    W = nint()
    v = [0] * (N + 1)
    w = [0] * (N + 1)
    for i in range(1, N + 1):
        v[i] = nint()
        w[i] = nint()
    sumV = [[0] * (W + 1) for _ in range(N + 1)]
    for i in range(1, N + 1):
        for i_sum in range(w[i]):
            sumV[i][i_sum] = sumV[i - 1][i_sum]
        for i_sum in range(w[i], W + 1):
            sumV[i][i_sum] = max(sumV[i - 1][i_sum], sumV[i - 1][i_sum - w[i]] + v[i])
    print(sumV[N][W])

def nint():
    return int(sys.stdin.readline())

def nlong():
    return int(sys.stdin.readline())

def nstr():
    return sys.stdin.readline().strip()

def nsToChars():
    return list(sys.stdin.readline().strip())

def nints(n, padL=0, padR=0):
    a = [0] * (padL + n + padR)
    it = iter(map(int, sys.stdin.readline().split()))
    for i in range(n):
        a[padL + i] = next(it)
    return a

def nlongs(n, padL=0, padR=0):
    a = [0] * (padL + n + padR)
    it = iter(map(int, sys.stdin.readline().split()))
    for i in range(n):
        a[padL + i] = next(it)
    return a

def nstrs(n):
    return [sys.stdin.readline().strip() for _ in range(n)]

def nsToChars2D(h, w, pad=0):
    a2 = [[''] * (w + pad * 2) for _ in range(h + pad * 2)]
    for i in range(h):
        a = list(sys.stdin.readline().strip())
        for j in range(w):
            a2[pad + i][pad + j] = a[j]
    return a2

if __name__ == "__main__":
    main()

