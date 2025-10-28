
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    N = data[0]
    a = data[1:N+1]
    a.sort()
    ans = 0
    if N == 1:
        if a[0] > 1:
            ans = 1
    else:
        for j in range(N):
            if j == 0 or a[j] != a[j-1]:
                tmp = 1
                i = j + 1
                while i < N and a[i] == a[j]:
                    tmp += 1
                    i += 1
                if tmp > a[j]:
                    ans += tmp - a[j]
                elif tmp < a[j]:
                    ans += tmp
    print(ans)

if __name__ == "__main__":
    main()

