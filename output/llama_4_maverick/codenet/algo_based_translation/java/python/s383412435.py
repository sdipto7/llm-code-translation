
import sys

def main():
    N = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().split()))
    if len(a) != N:
        raise ValueError("Invalid input")
    a.sort()
    ans = 0
    if N == 1 and a[0] > 1:
        ans = 1
    else:
        j = 0
        while j < N:
            tmp = 1
            i = j + 1
            while i < N and a[j] == a[i]:
                tmp += 1
                i += 1
            if tmp > a[j]:
                ans += tmp - a[j]
            elif tmp < a[j]:
                ans += tmp
            j = i
    print(ans)

if __name__ == "__main__":
    main()

