
import sys

def main():
    sc = sys.stdin
    so = sys.stdout

    N = nint(sc)
    W = nint(sc)
    v = [0] * (N + 1)
    w = [0] * (N + 1)

    for i in range(1, N + 1):
        v[i] = nint(sc)
        w[i] = nint(sc)

    sumV = [[0] * (W + 1) for _ in range(N + 1)]

    for i in range(1, N + 1):
        for i_sum in range(w[i]):
            sumV[i][i_sum] = sumV[i-1][i_sum]
        for i_sum in range(w[i], W + 1):
            sumV[i][i_sum] = max(sumV[i-1][i_sum], sumV[i-1][i_sum-w[i]] + v[i])

    so.write(f"{sumV[N][W]}\n")

def nlong(sc):
    return int(sc.readline().strip())

def nint(sc):
    return int(sc.readline().strip())

def nstr(sc):
    return sc.readline().strip()

def nsToChars(sc):
    return list(sc.readline().strip())

def nlongs(sc, n):
    return nlongs(sc, n, 0, 0)

def nints(sc, n):
    return nints(sc, n, 0, 0)

def nints(sc, n, padL, padR):
    a = [0] * (padL + n + padR)
    for i in range(n):
        a[padL + i] = nint(sc)
    return a

def nlongs(sc, n, padL, padR):
    a = [0] * (padL + n + padR)
    for i in range(n):
        a[padL + i] = nlong(sc)
    return a

def nstrs(sc, n):
    a = [''] * n
    for i in range(n):
        a[i] = nstr(sc)
    return a

def nsToChars2D(sc, h, w):
    return nsToChars2D(sc, h, w, 0)

def nsToChars2D(sc, h, w, pad):
    a2 = [[''] * (w + pad * 2) for _ in range(h + pad * 2)]
    for i in range(h):
        row = nsToChars(sc)
        a2[pad + i][pad:pad + w] = row[:w]
    return a2

if __name__ == "__main__":
    main()

