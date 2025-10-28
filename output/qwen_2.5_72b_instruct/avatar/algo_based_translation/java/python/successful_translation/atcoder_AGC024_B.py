
import sys

def main():
    import sys
    from collections import defaultdict

    input = sys.stdin.read().split()
    index = 0

    N = int(input[index])
    index += 1

    P = [int(input[i]) - 1 for i in range(index, index + N)]
    index += N

    map = {}
    for i in range(N):
        map[P[i]] = i

    nglist = []
    for i in range(N - 1):
        if map[i] > map[i + 1]:
            nglist.append(i)

    if not nglist:
        print(0)
        return

    ans = min(N - nglist[0] - 1, nglist[-1] + 1)
    for i in range(len(nglist) - 1):
        ans = min(nglist[i] + 1 + N - nglist[i + 1] - 1, ans)

    print(ans)

if __name__ == "__main__":
    main()

