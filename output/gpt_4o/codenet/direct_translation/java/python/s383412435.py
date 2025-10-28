
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    a = list(map(int, data[1:]))
    ans = 0
    a.sort()
    if N == 1 and a[0] > 1:
        ans = 1
    else:
        j = 0
        while j < N:
            if j == 0 or a[j] != a[j - 1]:
                tmp = 1
                for i in range(j + 1, N):
                    if a[j] == a[i]:
                        tmp += 1
                    else:
                        break
                if tmp > a[j]:
                    ans += tmp - a[j]
                elif tmp < a[j]:
                    ans += tmp
            j += 1
    print(ans)

main()

