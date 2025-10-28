
def main():
    import sys
    N = int(sys.stdin.readline())
    P = [int(x) - 1 for x in sys.stdin.readline().split()]
    pos = {x: i for i, x in enumerate(P)}
    nglist = [i for i in range(N - 1) if pos[i] > pos[i + 1]]
    if not nglist:
        print(0)
        return
    ans = min(N - nglist[0] - 1, nglist[-1] + 1)
    for i in range(len(nglist) - 1):
        ans = min(nglist[i] + 1 + N - nglist[i + 1] - 1, ans)
    print(ans)

if __name__ == "__main__":
    main()

