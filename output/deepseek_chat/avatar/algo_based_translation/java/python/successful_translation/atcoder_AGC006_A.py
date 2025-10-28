
import sys

N = 210
f = [0] * N
b = [''] * N

def getFail(b, m):
    j = 0
    f[0] = 0
    f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    s1 = data[1]
    s2 = data[2]
    cnt = 0
    for i in range(n):
        cnt += 1
        b[cnt] = s2[i]
    for i in range(n):
        cnt += 1
        b[cnt] = s1[i]
    getFail(b, cnt)
    length = min(f[cnt], n)
    print(2 * n - length)

if __name__ == '__main__':
    main()

