
n = int(input())
P = list(map(lambda x: int(x)-1, input().split()))
index_map = {val: idx for idx, val in enumerate(P)}
nglist = []
for i in range(n-1):
    if index_map[i] > index_map[i+1]:
        nglist.append(i)
if not nglist:
    print(0)
else:
    ans = min(n - nglist[0] - 1, nglist[-1] + 1)
    for i in range(len(nglist)-1):
        ans = min(ans, nglist[i] + 1 + n - nglist[i+1] - 1)
    print(ans)

