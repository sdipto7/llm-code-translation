
import sys

N = 200 + 10
f = [0] * N
b = [''] * N

def getFail(b, m):
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    s1 = input[1]
    str = input[2]
    cnt = 0
    for i in range(n):
        cnt += 1
        b[cnt] = str[i]
    for i in range(n):
        cnt += 1
        b[cnt] = s1[i]
    getFail(b, cnt)
    len = min(f[cnt], n, n)
    print(2 * n - len)

if __name__ == "__main__":
    main()

