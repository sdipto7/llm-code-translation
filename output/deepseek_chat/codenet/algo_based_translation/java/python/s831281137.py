
import sys

def main():
    sc = sys.stdin
    so = sys.stdout
    N = nint(sc)
    W = nint(sc)
    v = [0] * (N+1)
    w = [0] * (N+1)
    
    for i in range(1, N+1):
        v[i] = nint(sc)
        w[i] = nint(sc)
    
    sumV = [[0] * (W+1) for _ in range(N+1)]
    
    for i in range(1, N+1):
        for i_sum in range(0, w[i]):
            sumV[i][i_sum] = sumV[i-1][i_sum]
        
        for i_sum in range(w[i], W+1):
            sumV[i][i_sum] = max(sumV[i-1][i_sum], sumV[i-1][i_sum - w[i]] + v[i])
    
    so.write(str(sumV[N][W]) + '\n')

def nlong(sc):
    return int(sc.readline().strip())

def nint(sc):
    return int(sc.readline().strip())

def nstr(sc):
    return sc.readline().strip()

def ns_to_chars(sc):
    return list(sc.readline().strip())

def nlongs(sc, n):
    return nlongs_padded(sc, n, 0, 0)

def nints(sc, n):
    return nints_padded(sc, n, 0, 0)

def nints_padded(sc, n, padL, padR):
    a = [0] * (padL + n + padR)
    for i in range(n):
        a[padL + i] = nint(sc)
    return a

def nlongs_padded(sc, n, padL, padR):
    a = [0] * (padL + n + padR)
    for i in range(n):
        a[padL + i] = nlong(sc)
    return a

def nstrs(sc, n):
    a = [''] * n
    for i in range(n):
        a[i] = nstr(sc)
    return a

def ns_to_chars_2d(sc, h, w):
    return ns_to_chars_2d_padded(sc, h, w, 0)

def ns_to_chars_2d_padded(sc, h, w, pad):
    a2 = [[''] * (w + pad * 2) for _ in range(h + pad * 2)]
    for i in range(h):
        chars = ns_to_chars(sc)
        for j in range(w):
            a2[pad + i][pad + j] = chars[j]
    return a2

if __name__ == '__main__':
    main()

