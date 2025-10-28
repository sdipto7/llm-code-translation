
def main():
    N = int(input())
    P = list(map(lambda x: int(x) - 1, input().split()))
    map_dict = {P[i]: i for i in range(N)}
    nglist = [i for i in range(N - 1) if map_dict[i] > map_dict[i + 1]]
    if not nglist:
        print(0)
        return
    ans = min(N - nglist[0] - 1, nglist[-1] + 1)
    for i in range(len(nglist) - 1):
        ans = min(ans, nglist[i] + 1 + N - nglist[i + 1] - 1)
    print(ans)

if __name__ == "__main__":
    main()

