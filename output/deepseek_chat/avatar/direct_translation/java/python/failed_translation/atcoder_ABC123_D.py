
import sys
import itertools

def main():
    x = [int(sys.stdin.readline()) for _ in range(3)]
    k = int(sys.stdin.readline())
    a = [sorted([int(sys.stdin.readline()) for _ in range(size)]) for size in x]
    ans = []
    for i in range(x[0]):
        for j in range(x[1]):
            for m in range(x[2]):
                if (i + 1) * (j + 1) * (m + 1) <= k:
                    tmp = a[0][x[0] - i - 1] + a[1][x[1] - j - 1] + a[2][x[2] - m - 1]
                    ans.append(tmp)
    ans.sort()
    n = len(ans)
    for i in range(k):
        print(ans[n - i - 1])

if __name__ == "__main__":
    main()

