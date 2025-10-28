
import sys

def main():
    import sys
    from sys import stdin, stdout
    from io import BufferedReader, StringIO

    input = BufferedReader(StringIO(sys.stdin.read())).readline
    output = stdout.write

    n = int(input().strip())
    a = [list(input().strip()) for _ in range(n)]
    P, Q = 37, 47
    powP = [1] * (n + 1)
    powQ = [1] * (n + 1)
    for i in range(1, n + 1):
        powP[i] = powP[i - 1] * P
        powQ[i] = powQ[i - 1] * Q

    hashRow = [[0] * n for _ in range(n)]
    hashCol = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            for k in range(n):
                hashRow[i][k] += ord(a[i][j]) * powP[(j - k + n) % n]
                hashCol[j][k] += ord(a[i][j]) * powP[(i - k + n) % n]

    ans = 0
    for A in range(n):
        for B in range(n):
            ok = True
            for i in range(n):
                ok &= hashRow[(i + A) % n][B] == hashCol[(i + B) % n][A]
            if ok:
                ans += 1
    output(str(ans) + '\n')

if __name__ == '__main__':
    main()

