
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    P = [int(x) - 1 for x in data[1:]]
    
    map_index = {P[i]: i for i in range(N)}
    nglist = []
    
    for i in range(N - 1):
        if map_index[i] > map_index[i + 1]:
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

